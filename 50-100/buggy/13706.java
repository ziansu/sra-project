public java.util.List<com.dynatrace.forumexport.confluence.Question> getConfluenceContent(java.lang.String spaceName, java.lang.String forumName) {
    java.lang.System.out.println((((("=== Space: '" + spaceName) + "'; Forum: '") + forumName) + "' ==="));
    dbConnection = createDatabaseConnection();
    restClient = new com.dynatrace.forumexport.confluence.rest.RestClient();
    int forumContentId = getContentId(spaceName, forumName);
    java.lang.System.out.println((("=== Forum Content ID: '" + forumContentId) + "' ==="));
    java.util.List<com.dynatrace.forumexport.confluence.Question> questions = getQuestions(forumContentId);
    return questions;
}