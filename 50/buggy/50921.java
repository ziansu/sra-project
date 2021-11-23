protected void checkValidJsonStr(java.lang.String jsonStr) {
    try {
        new com.google.gson.JsonParser().parse(this.descriptor);
    } catch (com.google.gson.JsonParseException e) {
        log.warn(("Not a valid JSON String : " + jsonStr));
        com.google.common.base.Throwables.propagate(e);
    }
}