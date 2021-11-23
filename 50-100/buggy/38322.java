@java.lang.Override
public T map(com.subinkrishna.simplehttp.Http.Response response) {
    T result = null;
    if (null != response) {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = new java.lang.String(response.mBody);
        result = gson.fromJson(json, mType);
    }
    return result;
}