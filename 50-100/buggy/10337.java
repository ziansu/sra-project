@java.lang.Override
public byte[] readBytes() throws java.sql.SQLException {
    java.lang.Object val = getNextAttributeValue();
    if (val == null) {
        return null;
    }
    com.impossibl.postgres.types.CompositeType.Attribute attr = type.getAttribute(currentAttrIdx);
    if (attr == null) {
        throw new java.sql.SQLException("Invalid input request (type not array)");
    }
    java.io.InputStream data = com.impossibl.postgres.jdbc.SQLTypeUtils.coerceToByteStream(getNextAttributeValue(), attr.type, connection);
    try {
        return com.impossibl.postgres.utils.guava.ByteStreams.toByteArray(data);
    } catch (java.io.IOException e) {
        throw new java.sql.SQLException(e);
    }
}