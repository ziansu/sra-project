public java.lang.String toStringPretty() {
    if (((str) != null) && ((strFormatting) == (com.sproutigy.commons.jsonright.jackson.JSON.Formatting.Pretty))) {
        return str;
    }
    try {
        return getObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(node());
    } catch (com.sproutigy.commons.jsonright.jackson.JsonProcessingException e) {
        throw new java.lang.RuntimeException(e);
    }
}