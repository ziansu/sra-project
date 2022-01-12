private com.englishschool.controllers.Test getTest() {
    com.englishschool.controllers.Test test = new com.englishschool.controllers.Test();
    java.util.List<java.lang.String> questions = new java.util.ArrayList<>();
    questions.add("5612c3c295de30f9fd2392f1");
    questions.add("5612c3e295de30f9fd2392f2");
    test.setId("12345");
    test.setQuestionIds(questions);
    test.setTimeOfTest(1200);
    testService.save(test);
    return test;
}