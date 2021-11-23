@java.lang.Override
public java.lang.String getExternalProperty(java.lang.String propName) {
    java.lang.String value = allProperties.get(propName).toString();
    return value != null ? value : resolver.property.ExternalPropertyReader.EMPTY_STRING;
}