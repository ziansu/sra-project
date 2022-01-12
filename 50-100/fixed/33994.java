public static utils.auth.MobileAppSessionToken decrypt(com.fasterxml.jackson.databind.JsonNode json) {
    try {
        org.bson.types.ObjectId appInstanceId = new org.bson.types.ObjectId(json.get("a").asText());
        java.lang.String phrase = json.get("p").asText();
        long created = json.get("c").asLong();
        return new utils.auth.MobileAppSessionToken(appInstanceId, phrase, created);
    } catch (java.lang.Exception e) {
        return null;
    }
}