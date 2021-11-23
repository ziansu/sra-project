@java.lang.Override
public java.lang.String getExternalProperty(java.lang.String propName) {
    java.lang.Object value = allProperties.get(propName);
    return value != null ? value.toString() : resolver.property.ExternalPropertyReader.EMPTY_STRING;
}