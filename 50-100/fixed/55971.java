private java.util.Map<java.lang.String, java.lang.Object> getModelWithQuestions(java.util.List<com.englishschool.controllers.Question> questions, com.englishschool.controllers.Test currentTest, com.englishschool.controllers.PassedTest passedTest) {
    java.util.Map<java.lang.String, java.lang.Object> model = new java.util.HashMap<>();
    model.put(com.englishschool.controllers.QUESTIONS, questions);
    model.put(com.englishschool.controllers.TIMER, getRemainingTime(passedTest, currentTest));
    model.put(com.englishschool.controllers.PASSED_TEST_MODEL, getPassedTestModelAttribute(currentTest));
    return model;
}