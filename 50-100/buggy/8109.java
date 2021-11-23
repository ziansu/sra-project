@org.junit.Test
public void testGenerateOption() {
    for (int i = 0; i < 10000; i++) {
        testQuestion1.generateQuestion(4);
        tests.Fraction answer = testQuestion1.generateAnswer(4);
        assertFalse(testQuestion1.generateOption(4, answer).checkEquals(testQuestion1.getCorrectAnswer()));
    }
}