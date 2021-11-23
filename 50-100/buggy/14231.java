public void adjustToErrorGivenOutput(double error, double output) {
    for (utilities.Pair<neuralNetwork.Perceptron, java.lang.Double> pair : inputWeightPairs) {
        double weight = pair.getRight();
        pair.setRight((weight + (((LEARNING_RATE) * error) * output)));
    }
}