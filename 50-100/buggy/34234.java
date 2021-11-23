public void updateWeights() {
    bias = (bias) - (((Perceptron.LEARNING_RATE) * (delta)) * (activationValue));
    for (int i = 0; i < (inputWeights.size()); i++) {
        double weight = inputWeights.get(i);
        inputWeights.set(i, (weight - (((Perceptron.LEARNING_RATE) * (delta)) * (activationValue))));
    }
}