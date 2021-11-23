private echoquery.sql.joins.InferredContext inferPrefixes(java.lang.String aggregation, java.util.List<java.lang.String> comparisons, java.lang.String table, java.lang.String destinationTable) {
    java.util.List<java.lang.String> comparisonPrefixes = inferPrefixesForList(comparisons, table, destinationTable);
    java.lang.String aggregationPrefix = (aggregation != null) ? inferPrefixForSingle(aggregation, table, destinationTable) : null;
    return new echoquery.sql.joins.InferredContext(aggregationPrefix, comparisonPrefixes);
}