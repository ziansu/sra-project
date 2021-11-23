@org.junit.Test
public void doesNotAdjustToError() {
    neuralNetwork.InputPerceptron testPerceptron = new neuralNetwork.InputPerceptron(0);
    final double testInput = 1.0;
    testPerceptron.setInput(testInput);
    testPerceptron.activate();
    testPerceptron.calculateDeltas();
    testPerceptron.adjustToError();
    testPerceptron.activate();
    assertEquals(testInput, testPerceptron.output(), DELTA);
}