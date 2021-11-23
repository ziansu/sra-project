public boolean ParseJSONObject() {
    int code = 0;
    try {
        code = jsonObj.getInteger("cod");
    } catch (java.lang.Exception e) {
    }
    if (code == 200) {
        org.vertx.java.core.json.JsonObject newData = CreateCorrectJSONObject();
        CreateCorrectResponseString(newData);
        return true;
    }else {
        responseString.append(jsonObj);
        return false;
    }
}