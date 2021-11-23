private boolean isNotJsonString(final java.lang.String value) throws java.io.IOException {
    return ((((value.startsWith("{")) || (value.startsWith("["))) || (value.equals("true"))) || (value.equals("false"))) || (springfox.documentation.swagger2.configuration.Swagger2JacksonModule.PropertyExampleSerializerMixin.PropertyExampleSerializer.JSON_NUMBER_PATTERN.matcher(value).matches());
}