@java.lang.Override
public T map(com.subinkrishna.simplehttp.Http.Response response) {
    T result = null;
    java.lang.String json = null;
    if ((null != response) && (null != (response.mBody))) {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        json = new java.lang.String(response.mBody);
        result = gson.fromJson(json, mType);
    }
    return result;
}