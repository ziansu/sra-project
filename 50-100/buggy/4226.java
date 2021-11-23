@org.corfudb.runtime.collections.Accessor
public java.util.Collection getByNamedIndex(java.lang.String indexName, I indexKey) {
    java.util.Map<I, java.util.Set<P>> indexMap = indexMaps.get(indexName.hashCode());
    if (indexMap == null)
        return java.util.Collections.EMPTY_SET;
    
    java.util.Collection result = indexMap.get(indexKey);
    return result != null ? com.google.common.collect.ImmutableList.copyOf(result) : java.util.Collections.EMPTY_SET;
}