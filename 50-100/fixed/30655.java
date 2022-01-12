private org.apache.carbondata.core.datastore.columnar.IndexStorage encodeAndCompressDictDimension(byte[][] data, boolean isSort, boolean isUseInvertedIndex) {
    if (isUseInvertedIndex) {
        if ((version) == (org.apache.carbondata.core.metadata.ColumnarFormatVersion.V3)) {
            return new org.apache.carbondata.core.datastore.columnar.BlockIndexerStorageForShort(data, true, false, isSort);
        }else {
            return new org.apache.carbondata.core.datastore.columnar.BlockIndexerStorageForInt(data, true, false, isSort);
        }
    }else {
        if ((version) == (org.apache.carbondata.core.metadata.ColumnarFormatVersion.V3)) {
            return new org.apache.carbondata.core.datastore.columnar.BlockIndexerStorageForNoInvertedIndexForShort(false, data);
        }else {
            return new org.apache.carbondata.core.datastore.columnar.BlockIndexerStorageForNoInvertedIndex(data);
        }
    }
}