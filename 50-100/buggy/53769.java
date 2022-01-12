private com.englishschool.entity.spring.PassedTestModelAttribute getPassedTestModelAttribute(com.englishschool.controllers.Test currentTest) {
    com.englishschool.entity.spring.PassedTestModelAttribute passedTest = new com.englishschool.entity.spring.PassedTestModelAttribute();
    java.util.ArrayList<com.englishschool.entity.spring.PassedQuestionModelAttribute> passedQuestions = new java.util.ArrayList<>();
    for (int i = 0; i < (currentTest.getQuestionIds().size()); i++) {
        com.englishschool.entity.spring.PassedQuestionModelAttribute passedQuestion = new com.englishschool.entity.spring.PassedQuestionModelAttribute();
        passedQuestions.add(passedQuestion);
    }
    passedTest.setPassedQuestions(passedQuestions);
    return passedTest;
}