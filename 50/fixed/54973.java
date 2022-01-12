public boolean exists() {
    return !(org.teavm.jso.JS.isUndefined(database.begin("properties").store("properties").get(org.teavm.jso.JS.wrap(new java.lang.String[]{ "size" }))));
}