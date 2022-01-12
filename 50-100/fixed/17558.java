@java.lang.Override
public java.lang.Object parseAndClose(final java.io.Reader reader, final java.lang.reflect.Type dataType) throws java.io.IOException {
    try {
        final java.lang.Class clazz = java.lang.Class.forName(dataType.getTypeName());
        return com.joyent.manta.client.MantaObjectParser.MAPPER.readValue(reader, clazz);
    } catch (java.lang.ClassNotFoundException e) {
        java.lang.String msg = java.lang.String.format("Unable to find class with name: %s", dataType.getTypeName());
        throw new java.io.IOException(msg, e);
    } finally {
        reader.close();
    }
}