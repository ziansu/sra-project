public static java.lang.String toImportHeaderValues(java.util.Collection<? extends java.util.Collection<?>> headerValues) {
    java.io.StringWriter writer = new java.io.StringWriter();
    for (java.util.Collection<?> array : headerValues) {
        com.arangodb.entity.EntityFactory.gson.toJson(array, writer);
        writer.write('\n');
    }
    writer.flush();
    return writer.toString();
}