public void operatorAssign(org.zenframework.z8.server.types.string source) {
    object = (source.isEmpty()) ? new org.zenframework.z8.server.base.json.parser.JsonObject() : new org.zenframework.z8.server.base.json.parser.JsonObject(source.get());
}