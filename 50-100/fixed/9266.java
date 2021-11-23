private void setUserSessionInfo(java.lang.String response) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    com.mediamath.terminalone.models.T1User resp;
    java.lang.reflect.Type responseTypeInfo = new com.google.gson.reflect.TypeToken<com.mediamath.terminalone.models.T1User>() {    }.getType();
    resp = gson.fromJson(response, responseTypeInfo);
    this.setUser(resp);
}