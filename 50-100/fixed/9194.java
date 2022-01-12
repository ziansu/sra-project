private boolean isNotJsonString(final java.lang.String value) throws java.io.IOException {
    return ((((value.startsWith("{")) || (value.startsWith("["))) || ("true".equals(value))) || ("false".equals(value))) || (springfox.documentation.swagger2.configuration.Swagger2JacksonModule.PropertyExampleSerializerMixin.PropertyExampleSerializer.JSON_NUMBER_PATTERN.matcher(value).matches());
}