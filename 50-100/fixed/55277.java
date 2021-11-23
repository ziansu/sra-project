@java.lang.Override
public java.lang.String[] getFieldValues(com.browseengine.bobo.api.BoboIndexReader reader, int id) {
    com.browseengine.bobo.facets.data.FacetDataCache dataCache = getFacetData(reader);
    if (dataCache == null)
        return new java.lang.String[0];
    
    if (_multiValue) {
        return ((com.browseengine.bobo.facets.data.MultiValueFacetDataCache) (dataCache))._nestedArray.getTranslatedData(id, dataCache.valArray);
    }else {
        return new java.lang.String[]{ dataCache.valArray.get(dataCache.orderArray.get(id)) };
    }
}