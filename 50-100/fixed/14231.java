public void adjustToErrorGivenOutput(double error, double output) {
    for (int i = 0; i < (inputWeightPairs.size()); i++) {
        utilities.Pair<neuralNetwork.Perceptron, java.lang.Double> pair = inputWeightPairs.get(i);
        double weight = pair.getRight();
        pair.setRight((weight + (((LEARNING_RATE) * error) * output)));
    }
}