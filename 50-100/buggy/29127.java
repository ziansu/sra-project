public java.lang.String getPronounciation(java.lang.String word) throws java.lang.Exception {
    com.wordnik.client.api.WordApi api = new com.wordnik.client.api.WordApi();
    api.getInvoker().addDefaultHeader("api_key", JoveNotes.config.getWordnicAPIKey());
    java.util.List<com.wordnik.client.model.TextPron> pronounciations = api.getTextPronunciations(word, null, null, "false", 1);
    if (!(pronounciations.isEmpty())) {
        return pronounciations.get(0).getRaw();
    }
    return null;
}