public void testRemoveNonKeywords() {
    java.lang.String nonKeywords;
    java.lang.String keywordsOnly;
    nonKeywords = "Hello what's up dog invocabot schedule a meeting tomorrow at nine p m";
    keywordsOnly = "schedule meeting tomorrow nine pm";
    assertEquals(voicePlusPlus.voicePlusPlus_sphinx4.Keyword.removeNonKeywords(nonKeywords), keywordsOnly);
}