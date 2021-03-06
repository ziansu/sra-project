@java.lang.Override
public int getNumItems(com.browseengine.bobo.api.BoboIndexReader reader, int id) {
    com.browseengine.bobo.facets.data.FacetDataCache dataCache = getFacetData(reader);
    if (dataCache == null)
        return 0;
    
    int encoded = dataCache.orderArray.get(id);
    return com.browseengine.bobo.facets.impl.CompactMultiValueFacetHandler.countBits(encoded);
}