public java.lang.String getPartitionDir(java.lang.String partitionId) {
    return (((getFactDir()) + (java.io.File.separator)) + (org.carbondata.core.carbon.path.CarbonTablePath.PARTITION_PREFIX)) + partitionId;
}