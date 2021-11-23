@java.lang.Override
public java.lang.Object[] getRawFieldValues(com.browseengine.bobo.api.BoboIndexReader reader, int id) {
    com.browseengine.bobo.facets.data.MultiValueFacetDataCache dataCache = getFacetData(reader);
    return dataCache._nestedArray.getRawData(id, dataCache.valArray);
}