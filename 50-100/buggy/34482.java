@java.lang.Override
public org.apache.carbondata.core.datastore.columnar.IndexStorage call() throws java.lang.Exception {
    if (isUseInvertedIndex) {
        if ((version) == (org.apache.carbondata.core.metadata.ColumnarFormatVersion.V3)) {
            return new org.apache.carbondata.core.datastore.columnar.BlockIndexerStorageForShort(this.data, isCompressionReq, isNoDictionary, isSortRequired);
        }else {
            return new org.apache.carbondata.core.datastore.columnar.BlockIndexerStorageForInt(this.data, isCompressionReq, isNoDictionary, isSortRequired);
        }
    }else {
        if ((version) == (org.apache.carbondata.core.metadata.ColumnarFormatVersion.V3)) {
            return new org.apache.carbondata.core.datastore.columnar.BlockIndexerStorageForNoInvertedIndexForShort(this.data);
        }else {
            return new org.apache.carbondata.core.datastore.columnar.BlockIndexerStorageForNoInvertedIndex(this.data);
        }
    }
}