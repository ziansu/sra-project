@java.lang.Override
public org.apache.beam.dsls.sql.schema.BeamSqlRow merge(java.lang.Iterable<org.apache.beam.dsls.sql.schema.BeamSqlRow> accumulators) {
    java.math.BigDecimal v = new java.math.BigDecimal(0);
    long s = 0;
    while (accumulators.iterator().hasNext()) {
        org.apache.beam.dsls.sql.schema.BeamSqlRow r = accumulators.iterator().next();
        v.add(r.getBigDecimal(0));
        s += r.getLong(1);
    } 
    return new org.apache.beam.dsls.sql.schema.BeamSqlRow(accType, java.util.Arrays.<java.lang.Object>asList(v, s));
}