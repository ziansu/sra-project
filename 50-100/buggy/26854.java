public static java.util.Date convertDate(com.fasterxml.jackson.databind.JsonNode node, java.lang.String dateTimeFormat) {
    return node.isNumber() ? new java.util.Date(node.asLong()) : node.isTextual() ? com.github.ddth.commons.utils.DateFormatUtils.fromString(node.asText(), dateTimeFormat) : null;
}