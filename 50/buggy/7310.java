private java.lang.String getPrettyJson(java.lang.String json) {
    return (json != null) && (!(json.isEmpty())) ? gson.toJson(jsonParser.parse(json)) : "";
}