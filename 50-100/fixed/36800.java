@java.lang.Override
public com.tr.rp.core.LanguageElement visitWhile_stat(com.tr.rp.parser.DefProgParser.While_statContext ctx) {
    com.tr.rp.expressions.bool.BoolExpression boolExpr = ((com.tr.rp.expressions.bool.BoolExpression) (visit(ctx.boolexpr())));
    com.tr.rp.core.DStatement a = ((com.tr.rp.core.DStatement) (visit(ctx.statement())));
    return new com.tr.rp.statement.While(boolExpr, a);
}