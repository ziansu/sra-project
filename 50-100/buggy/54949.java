@java.lang.Override
public com.google.common.base.Optional<java.lang.String> deserialize(com.fasterxml.jackson.core.JsonParser p, com.fasterxml.jackson.databind.DeserializationContext ctxt) throws java.io.IOException {
    java.lang.String value = p.getValueAsString();
    if (org.apache.commons.lang3.StringUtils.isNotEmpty(value)) {
        return com.google.common.base.Optional.of(com.orbitz.consul.util.Strings.unquote(new java.lang.String(com.google.common.io.BaseEncoding.base64().decode(value))));
    }
    return com.google.common.base.Optional.absent();
}