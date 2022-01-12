@java.lang.Override
public java.lang.Object handle(it.shortener.Request request, it.shortener.Response response) {
    java.lang.String shortUrl = request.queryParams("shortUrl");
    java.lang.String toReturn = "";
    if (it.shortener.SparkServer.urlAssociations.containsKey(shortUrl)) {
        toReturn = ((it.shortener.SparkServer.JSON_STRING_BEGINNING) + (it.shortener.SparkServer.urlAssociations.get(shortUrl).getStats())) + (it.shortener.SparkServer.JSON_STRING_ENDING);
    }else {
        toReturn = it.shortener.SparkServer.ERROR_KEY_NOT_FOUND;
    }
    return toReturn;
}