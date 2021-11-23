public static utils.auth.MobileAppSessionToken decrypt(java.lang.String unsafeSecret) {
    try {
        java.lang.String plaintext = utils.auth.TokenCrypto.decryptToken(unsafeSecret);
        com.fasterxml.jackson.databind.JsonNode json = play.libs.Json.parse(plaintext);
        org.bson.types.ObjectId appInstanceId = new org.bson.types.ObjectId(json.get("a").asText());
        java.lang.String phrase = json.get("p").asText();
        long created = json.get("c").asLong();
        return new utils.auth.MobileAppSessionToken(appInstanceId, phrase, created);
    } catch (java.lang.Exception e) {
        return null;
    }
}