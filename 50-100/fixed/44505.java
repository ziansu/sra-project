@java.lang.Override
public void exitRangeFilter(com.aerospike.aql.grammar.AQLParser.RangeFilterContext ctx) {
    org.stringtemplate.v4.ST st = getTemplateFor("filterRange");
    st.add("bin", ctx.bin().getText());
    st.add("low", ctx.low.getText());
    st.add("high", ctx.high.getText());
    putCode(ctx, st);
}