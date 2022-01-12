@java.lang.Override
public com.tr.rp.core.LanguageElement visitRanked_choice(com.tr.rp.parser.DefProgParser.Ranked_choiceContext ctx) {
    com.tr.rp.parser.DefProgParser.NumexprContext nctx = ctx.numexpr();
    com.tr.rp.expressions.num.NumExpression rank = ((com.tr.rp.expressions.num.NumExpression) (visit(nctx)));
    com.tr.rp.core.DStatement a = ((com.tr.rp.core.DStatement) (visit(ctx.statement().get(0))));
    com.tr.rp.core.DStatement b = ((com.tr.rp.core.DStatement) (visit(ctx.statement().get(1))));
    return new com.tr.rp.statement.Choose(a, b, rank);
}