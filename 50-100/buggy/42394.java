@java.lang.Override
public java.util.Iterator<gobblin.data.management.partition.FileSet<gobblin.data.management.copy.CopyEntity>> getFileSetIterator(org.apache.hadoop.fs.FileSystem targetFs, gobblin.data.management.copy.CopyConfiguration configuration) throws java.io.IOException {
    if (!(canCopyTable())) {
        return com.google.common.collect.Iterators.emptyIterator();
    }
    try {
        return new gobblin.data.management.copy.hive.HiveCopyEntityHelper(this, configuration, targetFs).getCopyEntities(configuration);
    } catch (java.io.IOException ioe) {
        log.error(("Failed to copy table " + (this.table)), ioe);
        return java.util.Collections.emptyIterator();
    }
}