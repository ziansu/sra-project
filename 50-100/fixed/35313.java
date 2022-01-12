public void train(double expected_predict) {
    this.expected_error = expected_predict;
    for (int i = (weightsCNN.size()) - 1; i >= 0; i--) {
        backPropagation(weightsCNN.get(i), layersCNN.get((i + 1)));
    }
}