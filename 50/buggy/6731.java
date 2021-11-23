@java.lang.Override
protected <T> T processResponse(java.net.HttpURLConnection connection, java.lang.reflect.Type typeOfT) throws java.io.IOException, me.figo.FigoException {
    int code = connection.getResponseCode();
    if (code == 404) {
        return null;
    }
    return super.processResponse(connection, typeOfT);
}