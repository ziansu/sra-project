@java.lang.Override
public MiniJavaVar visitClassDeclaration(miniJava.MiniJavaParser.ClassDeclarationContext ctx) {
    currentClassName = ctx.className.getText();
    currentClass = new MiniJavaClass();
    if (checkRedefinedClass(ctx))
        return MiniJavaVar.makeRuntimeError();
    
    currentClass.parentClassName = ctx.parentName.getText();
    currentClass.ctx = ctx;
    classes.put(currentClassName, currentClass);
    varCtx.enterBlock();
    visitChildren(ctx);
    varCtx.exitBlock();
    currentClass = null;
    currentClassName = null;
    return MiniJavaVar.makeVoid();
}