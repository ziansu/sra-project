public java.lang.String constructJsonString() {
    java.lang.String str = "";
    com.badlogic.gdx.utils.Json json = new com.badlogic.gdx.utils.Json();
    json.setOutputType(OutputType.json);
    str = json.toJson(this);
    str = json.prettyPrint(str);
    return str;
}