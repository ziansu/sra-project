public void updateQuestion(java.lang.String questionType, java.lang.Long questionID) {
    online.test.models.TestQuestions testQuestion = testQuestionsDao.findOne(questionID);
    testQuestion.setType(questionType);
    testQuestionsDao.save(testQuestion);
}