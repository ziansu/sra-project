public static final java.lang.String toJSON(com.perficient.aem.datalayer.api.DataLayer dataLayer) {
    java.lang.String json = null;
    com.google.gson.GsonBuilder builder = null;
    if ((dataLayer.getConfig().getPrettyPrint()) == true) {
        builder = new com.google.gson.GsonBuilder().setDateFormat(DataLayerConstants.DATE_FORMAT).setPrettyPrinting();
    }else {
        builder = new com.google.gson.GsonBuilder().setDateFormat(DataLayerConstants.DATE_FORMAT);
    }
    com.google.gson.Gson gson = builder.create();
    json = gson.toJson(dataLayer);
    return json;
}