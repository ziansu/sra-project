@java.lang.Override
public java.lang.Void visitVariableDeclarator(@org.antlr.v4.runtime.misc.NotNull
GEMParser.VariableDeclaratorContext ctx) {
    visit(ctx.variableDeclaratorId());
    if ((ctx.variableInitializer()) != null) {
        print("=");
        visit(ctx.variableDeclaratorId());
    }
    return null;
}