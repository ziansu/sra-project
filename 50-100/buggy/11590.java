public void ParseJSONObject() {
    int code = 0;
    try {
        code = jsonObj.getInteger("cod");
    } catch (java.lang.Exception e) {
    }
    if (code == 200) {
        org.vertx.java.core.json.JsonObject newData = CreateCorrectJSONObject();
        CreateCorrectResponseString(newData);
    }else {
        responseString.append(jsonObj);
    }
}