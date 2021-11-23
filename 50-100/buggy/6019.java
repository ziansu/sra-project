public static final java.lang.String toJSON(com.perficient.aem.datalayer.api.DataLayer dataLayer) {
    java.lang.String json = null;
    com.google.gson.GsonBuilder builder = new com.google.gson.GsonBuilder().setDateFormat(DataLayerConstants.DATE_FORMAT);
    if ((dataLayer.getConfig().getPrettyPrint()) == true) {
        builder.setPrettyPrinting();
    }
    com.google.gson.Gson gson = builder.create();
    json = gson.toJson(dataLayer);
    return json;
}