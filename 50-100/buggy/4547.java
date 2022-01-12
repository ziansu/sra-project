public void updateWeights(double rate) {
    for (int i = 0; i < (weights.length); i++) {
        double deltaW = ((-rate) * (connections[i].delta)) * (Output);
        weights[i] += delta;
    }
}