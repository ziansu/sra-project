@java.lang.Override
public boolean setContextPreferences(final java.util.Map<java.lang.String, java.lang.Object> preferences, final java.lang.String contextId) {
    try {
        final java.lang.String preferencesString = new com.fasterxml.jackson.databind.ObjectMapper().writeValueAsString(preferences);
        final java.lang.String byId = getQueryFor("social.system.preferences.emailPreferencesByContextId");
        getCollection().update(byId, contextId).with((("{$set: " + preferencesString) + "}"));
        return true;
    } catch (com.mongodb.MongoException | com.fasterxml.jackson.core.JsonProcessingException e) {
        return false;
    }
}