public void addQuestion(java.lang.Long testID, java.lang.Long userID, java.lang.String question) {
    online.test.models.TestQuestions testQuestions = new online.test.models.TestQuestions(null, question, testsDao.findById(testID), userDao.findById(userID), null, null, null, null);
    testQuestionsDao.save(testQuestions);
}