public void testRemoveNonKeywords() {
    java.lang.String nonKeywords;
    java.lang.String keywordsOnly;
    nonKeywords = "Hello what's up dog invocabot schedule a meeting tomorrow at nine p m";
    keywordsOnly = "schedule meeting tomorrow nine pm";
    java.lang.System.out.println(keywordsOnly);
    assertEquals(voicePlusPlus.voicePlusPlus_sphinx4.Keyword.removeNonKeywords(nonKeywords), keywordsOnly);
}