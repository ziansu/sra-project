private java.lang.Long getFirstId() throws java.io.IOException {
    com.cloudant.client.api.Database db = net.mybluemix.visualrecognitiontester.blmxservices.CloudantClientMgr.getCloudantDB();
    com.cloudant.client.api.views.ViewRequestBuilder builder = db.getViewRequestBuilder("maxID", "maxID");
    com.cloudant.client.api.views.ViewRequest<java.lang.String, java.lang.Long> result = builder.newRequest(Key.Type.STRING, java.lang.Long.class).build();
    java.lang.Long firstId = (result.getSingleValue()) + 1;
    return firstId;
}