private java.lang.String getGUID() {
    com.tinkerpop.blueprints.Vertex tableVertex = getTableEntityVertex();
    java.lang.String guid = tableVertex.getProperty(Constants.GUID_PROPERTY_KEY);
    if (guid == null) {
        org.testng.Assert.fail();
    }
    return guid;
}