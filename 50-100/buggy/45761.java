private void updateWeights(java.util.List<java.lang.Double> inputs, double learningRate) {
    for (int i = 1; i < (layers.size()); i++) {
        layers.get(i).updateWeights(layers.get((i - 1)), learningRate);
    }
}