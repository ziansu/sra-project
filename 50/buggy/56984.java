@java.lang.Override
public java.lang.String[] getFieldValues(com.browseengine.bobo.api.BoboIndexReader reader, int id) {
    com.browseengine.bobo.facets.data.MultiValueFacetDataCache dataCache = getFacetData(reader);
    return dataCache._nestedArray.getTranslatedData(id, dataCache.valArray);
}