private org.apache.carbondata.core.datastore.columnar.IndexStorage encodeAndCompressNoDictDimension(byte[][] data, boolean isSort, boolean isUseInvertedIndex) {
    if (isUseInvertedIndex) {
        if ((version) == (org.apache.carbondata.core.metadata.ColumnarFormatVersion.V3)) {
            return new org.apache.carbondata.core.datastore.columnar.BlockIndexerStorageForShort(data, false, true, isSort);
        }else {
            return new org.apache.carbondata.core.datastore.columnar.BlockIndexerStorageForInt(data, false, true, isSort);
        }
    }else {
        if ((version) == (org.apache.carbondata.core.metadata.ColumnarFormatVersion.V3)) {
            return new org.apache.carbondata.core.datastore.columnar.BlockIndexerStorageForNoInvertedIndexForShort(true, data);
        }else {
            return new org.apache.carbondata.core.datastore.columnar.BlockIndexerStorageForNoInvertedIndex(data);
        }
    }
}