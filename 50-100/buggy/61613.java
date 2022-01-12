@org.junit.Test
public void testDeleteQuiz() {
    testLibrary.addQuiz("Test1");
    testLibrary.addQuiz("Test2");
    testLibrary.addQuiz("Test1");
    testLibrary.deleteQuiz(1);
    java.util.List<Quiz> output = testLibrary.getQuizList();
    org.junit.Assert.assertEquals("Mismatch between expected and actual number of quiz games", 1, output.size());
}