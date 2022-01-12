@java.lang.Override
public void exitRangeFilter(com.aerospike.aql.grammar.AQLParser.RangeFilterContext ctx) {
    org.stringtemplate.v4.ST st = getTemplateFor("filterRange");
    st.add("bin", ctx.bin().getText());
    st.add("low", code.get(ctx.low));
    st.add("high", code.get(ctx.high));
    putCode(ctx, st);
}