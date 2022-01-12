private uk.gov.register.presentation.FieldValue convert(java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode> entry) {
    java.util.Optional<java.lang.String> register = fieldsConfiguration.getField(entry.getKey()).getRegister();
    return register.isPresent() ? new uk.gov.register.presentation.LinkValue(register.get(), entry.getKey(), entry.getValue().textValue()) : new uk.gov.register.presentation.StringValue(entry.getValue().textValue());
}