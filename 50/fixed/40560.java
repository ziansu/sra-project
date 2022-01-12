@java.lang.Override
public org.carbondata.core.datastorage.store.columnar.IndexStorage call() throws java.lang.Exception {
    if (isUseInvertedIndex) {
        return new org.carbondata.core.datastorage.store.columnar.BlockIndexerStorageForInt(this.data, isCompressionReq, isNoDictionary, isSortRequired);
    }else {
        return new org.carbondata.core.datastorage.store.columnar.BlockIndexerStorageForNoInvertedIndex(this.data, isCompressionReq, isNoDictionary);
    }
}