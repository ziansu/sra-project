@com.pratilipi.api.annotation.Get
public com.pratilipi.api.impl.pratilipi.shared.GenericPratilipiResponse getPratilipi(com.pratilipi.api.impl.pratilipi.shared.GetPratilipiRequest request) {
    com.pratilipi.data.DataAccessor dataAccessor = com.pratilipi.data.DataAccessorFactory.getDataAccessor();
    com.pratilipi.data.type.Pratilipi pratilipi = dataAccessor.getPratilipi(request.getPratilipiId());
    com.pratilipi.data.type.Author author = ((pratilipi.getAuthorId()) == null) ? null : dataAccessor.getAuthor(pratilipi.getAuthorId());
    com.pratilipi.data.client.PratilipiData pratilipiData = com.pratilipi.data.util.PratilipiDataUtil.createPratilipiData(pratilipi, author);
    com.google.gson.Gson gson = new com.google.gson.Gson();
    return gson.fromJson(gson.toJson(pratilipiData), com.pratilipi.api.impl.pratilipi.shared.GenericPratilipiResponse.class);
}