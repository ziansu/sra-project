private org.apache.hadoop.hive.metastore.hbase.HBaseFilterPlanUtil.ScanPlan and(org.apache.hadoop.hive.metastore.hbase.HBaseFilterPlanUtil.ScanPlan other) {
    org.apache.hadoop.hive.metastore.hbase.HBaseFilterPlanUtil.ScanPlan newPlan = new org.apache.hadoop.hive.metastore.hbase.HBaseFilterPlanUtil.ScanPlan();
    org.apache.hadoop.hive.metastore.hbase.HBaseFilterPlanUtil.ScanPlan.ScanMarker greaterStartMarker = getComparedMarker(this.getStartMarker(), other.getStartMarker(), true);
    newPlan.setStartMarker(greaterStartMarker);
    org.apache.hadoop.hive.metastore.hbase.HBaseFilterPlanUtil.ScanPlan.ScanMarker lesserEndMarker = getComparedMarker(this.getEndMarker(), other.getEndMarker(), false);
    newPlan.setEndMarker(lesserEndMarker);
    newPlan.setFilter(createCombinedFilter(this.getFilter(), other.getFilter()));
    return newPlan;
}