@java.lang.Override
public void exitRangeFilter(com.aerospike.aql.grammar.AQLParser.RangeFilterContext ctx) {
    long low = java.lang.Long.parseLong(ctx.low.getText());
    long high = java.lang.Long.parseLong(ctx.high.getText());
    java.lang.String binName = ctx.bin().getText();
    com.aerospike.client.query.IndexCollectionType type = null;
    filterProperty.put(ctx, com.aerospike.client.query.Filter.range(binName, type, low, high));
}