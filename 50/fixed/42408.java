public void setJsonObject(com.google.gson.JsonObject jsonObject) {
    this.jsonObject = jsonObject;
    if ((jsonObject.get("error")) != null) {
        errorMessage = jsonObject.get("error").toString();
    }
}