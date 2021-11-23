public void operatorAssign(org.zenframework.z8.server.types.string source) {
    array = (source.isEmpty()) ? new org.zenframework.z8.server.base.json.parser.JsonArray() : new org.zenframework.z8.server.base.json.parser.JsonArray(source.get());
}