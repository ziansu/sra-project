private java.util.List<dto.QuestionDto> loadAllQuestions(final java.util.List<dto.QuestionDto> questionsFromTest) {
    java.util.List<dto.QuestionDto> questionsFromDb = new java.util.ArrayList<dto.QuestionDto>();
    for (dto.QuestionDto questionFromTest : questionsFromTest) {
        if ((questionFromTest.getResponse()) == null) {
            dto.QuestionDto question = questionService.getQuestionById(questionFromTest.getId());
            if (question != null) {
                questionsFromDb.add(question);
            }
        }else {
            questionsFromDb.add(questionFromTest);
        }
    }
    return questionsFromDb;
}