public long getRowCount(org.apache.hadoop.mapreduce.JobContext job) throws java.io.IOException, org.carbondata.core.carbon.datastore.exception.IndexBuilderException {
    long rowCount = 0;
    org.carbondata.core.carbon.AbsoluteTableIdentifier absoluteTableIdentifier = new org.carbondata.core.carbon.AbsoluteTableIdentifier(getStorePathString(job), org.carbondata.hadoop.CarbonInputFormat.getTableToAccess(job));
    for (int segmentNo : getValidSegments(job)) {
        java.util.Map<java.lang.String, org.carbondata.core.carbon.datastore.block.AbstractIndex> segmentIndexMap = getSegmentAbstractIndexs(job, absoluteTableIdentifier, segmentNo);
        for (org.carbondata.core.carbon.datastore.block.AbstractIndex abstractIndex : segmentIndexMap.values()) {
            rowCount += abstractIndex.getTotalNumberOfRows();
        }
    }
    return rowCount;
}