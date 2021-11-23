@java.lang.Override
public void adjustSqlDigest(java.util.List<org.apache.kylin.metadata.model.MeasureDesc> measureDescs, org.apache.kylin.metadata.realization.SQLDigest sqlDigest) {
    for (org.apache.kylin.metadata.model.MeasureDesc measureDesc : measureDescs) {
        org.apache.kylin.metadata.model.FunctionDesc extendColumnFunc = measureDesc.getFunction();
        java.util.List<org.apache.kylin.metadata.model.TblColRef> hosts = org.apache.kylin.measure.extendedcolumn.ExtendedColumnMeasureType.getExtendedColumnHosts(extendColumnFunc);
        org.apache.kylin.metadata.model.TblColRef extended = org.apache.kylin.measure.extendedcolumn.ExtendedColumnMeasureType.getExtendedColumn(extendColumnFunc);
        if (!(sqlDigest.groupbyColumns.contains(extended))) {
            continue;
        }
        sqlDigest.aggregations.add(extendColumnFunc);
        sqlDigest.groupbyColumns.remove(extended);
        sqlDigest.groupbyColumns.addAll(hosts);
        sqlDigest.metricColumns.add(extended);
    }
}