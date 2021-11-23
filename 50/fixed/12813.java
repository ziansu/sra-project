@java.lang.Override
public boolean apply(org.apache.hadoop.hbase.regionserver.StoreFile storeFile) {
    if (storeFile == null) {
        return false;
    }
    return (storeFile.getMaximumTimestamp()) >= cutoff;
}