@org.openjdk.jmh.annotations.Benchmark
@org.openjdk.jmh.annotations.Threads(value = 1)
@org.openjdk.jmh.annotations.Warmup(time = 5)
@org.openjdk.jmh.annotations.Measurement(time = 40)
public java.lang.Object getManyRowsWithGetRows(com.palantir.atlasdb.performance.benchmarks.table.ConsecutiveNarrowTable.CleanNarrowTable table) {
    java.util.Map<com.palantir.atlasdb.keyvalue.api.Cell, com.palantir.atlasdb.keyvalue.api.Value> result = table.getKvs().getRows(table.getTableRef(), table.getRowList(), com.palantir.atlasdb.keyvalue.api.ColumnSelection.all(), java.lang.Long.MAX_VALUE);
    com.google.common.base.Preconditions.checkState(((result.size()) == (table.getRowList().size())), "Should be %s rows, but were: %s", table.getRowList().size(), result.size());
}