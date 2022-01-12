@java.lang.Override
public com.tr.rp.core.LanguageElement visitIf_stat(com.tr.rp.parser.DefProgParser.If_statContext ctx) {
    com.tr.rp.parser.DefProgParser.BoolexprContext bctx = ctx.boolexpr();
    com.tr.rp.expressions.bool.BoolExpression boolExpr = ((com.tr.rp.expressions.bool.BoolExpression) (visit(bctx)));
    com.tr.rp.core.DStatement a = ((com.tr.rp.core.DStatement) (visit(ctx.statement().get(0))));
    com.tr.rp.core.DStatement b = ((com.tr.rp.core.DStatement) (visit(ctx.statement().get(1))));
    return new com.tr.rp.statement.IfElse(boolExpr, a, b);
}