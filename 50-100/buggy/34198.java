private void handleRelation(java.util.List<com.impetus.kundera.db.RelationHolder> relation, org.apache.hadoop.hbase.client.Put p) {
    for (com.impetus.kundera.db.RelationHolder r : relation) {
        if (relation != null) {
            p.add(org.apache.hadoop.hbase.util.Bytes.toBytes(r.getRelationName()), java.lang.System.currentTimeMillis(), org.apache.hadoop.hbase.util.Bytes.toBytes(r.getRelationValue()));
        }
    }
}