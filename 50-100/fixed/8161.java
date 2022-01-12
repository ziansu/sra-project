public java.lang.Object createSingleValue(final java.lang.Object... param) {
    try {
        return com.orientechnologies.orient.core.metadata.schema.OType.convert(param[0], keyType.getDefaultJavaType());
    } catch (java.lang.Exception e) {
        throw new com.orientechnologies.orient.core.index.OIndexException(((("Invalid key for index: " + (param[0])) + " cannot be converted to ") + (keyType)), e);
    }
}