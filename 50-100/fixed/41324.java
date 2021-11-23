private static java.lang.Integer hashCodeFor(java.lang.Class<?> initialType, java.lang.String propertyName, org.modelmapper.config.Configuration configuration) {
    int result = 31 + (initialType.hashCode());
    result = (31 * result) + (propertyName.hashCode());
    result = (31 * result) + (configuration.hashCode());
    return result;
}