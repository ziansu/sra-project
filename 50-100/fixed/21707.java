public static java.lang.String getAnimeDataGson(java.lang.String dataToGet, int animeId) {
    java.lang.String data = null;
    com.google.gson.JsonElement element = util.ConnectionManager.getAnimeInformationGson(animeId, dataToGet);
    if (element != null) {
        com.google.gson.JsonElement dataElement = element.getAsJsonObject().get(dataToGet);
        if ((dataElement != null) && (!(dataElement.isJsonNull())))
            data = dataElement.getAsString();
        else
            data = "null";
        
    }
    return data;
}