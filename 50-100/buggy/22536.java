@java.lang.Override
public MiniJavaVar visitMainClass(miniJava.MiniJavaParser.MainClassContext ctx) {
    currentClassName = ctx.className.getText();
    currentClass = new MiniJavaClass();
    if (checkRedefinedClass(ctx))
        return MiniJavaVar.makeRuntimeError();
    
    currentClass.parentClassName = null;
    currentClass.ctx = null;
    varCtx.enterBlock();
    varCtx.assignVar(ctx.args.getText(), new MiniJavaVar("String[]", null));
    visit(ctx.stmtBlock());
    varCtx.exitBlock();
    return MiniJavaVar.makeVoid();
}