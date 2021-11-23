private org.jsonbuddy.parse.JsonArray parseArray() {
    org.jsonbuddy.parse.JsonArray jsonArrayFactory = new org.jsonbuddy.parse.JsonArray();
    while (!((finished) || ((lastRead) == ']'))) {
        readNext();
        if ((lastRead) == ']') {
            break;
        }
        org.jsonbuddy.parse.JsonNode jsonFactory = parseValue();
        jsonArrayFactory.add(jsonFactory);
        readSpaceUntil("Expected , or ] in array", ']', ',');
    } 
    if (finished) {
        throw new org.jsonbuddy.parse.JsonParseException("Expected , or ] in array");
    }
    return jsonArrayFactory;
}