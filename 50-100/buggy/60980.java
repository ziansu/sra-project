@java.lang.Override
public org.apache.beam.dsls.sql.schema.BeamSqlRow merge(java.lang.Iterable<org.apache.beam.dsls.sql.schema.BeamSqlRow> accumulators) {
    java.math.BigDecimal v = new java.math.BigDecimal(0);
    while (accumulators.iterator().hasNext()) {
        v.add(accumulators.iterator().next().getBigDecimal(0));
    } 
    return new org.apache.beam.dsls.sql.schema.BeamSqlRow(accType, java.util.Arrays.<java.lang.Object>asList(v));
}