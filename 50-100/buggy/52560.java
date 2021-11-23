public static java.util.Date convertDate(com.fasterxml.jackson.databind.JsonNode node) {
    java.text.DateFormat df = new java.text.SimpleDateFormat();
    try {
        return node.isNumber() ? new java.util.Date(node.asLong()) : node.isTextual() ? df.parse(node.asText()) : null;
    } catch (java.text.ParseException e) {
        return null;
    }
}