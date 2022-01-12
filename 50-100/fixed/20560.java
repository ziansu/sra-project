public static java.util.List<com.google.gson.JsonObject> getIndex(java.lang.Long pratilipiId) throws com.pratilipi.common.exception.InsufficientAccessException, com.pratilipi.common.exception.UnexpectedServerException {
    com.pratilipi.data.DataAccessor dataAccessor = com.pratilipi.data.DataAccessorFactory.getDataAccessor();
    com.pratilipi.data.type.Pratilipi pratilipi = dataAccessor.getPratilipi(pratilipiId);
    if (!(com.pratilipi.data.util.PratilipiDataUtil.hasAccessToReadPratilipiContent(pratilipi)))
        throw new com.pratilipi.common.exception.InsufficientAccessException();
    
    com.pratilipi.data.DocAccessor docAccessor = com.pratilipi.data.DataAccessorFactory.getDocAccessor();
    com.pratilipi.data.type.PratilipiContentDoc pcDoc = docAccessor.getPratilipiContentDoc(pratilipiId);
    if (pcDoc == null)
        return new java.util.ArrayList<>(0);
    
    return pcDoc.getIndex();
}