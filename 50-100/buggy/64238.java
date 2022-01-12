public void predict(int numbOfWeingtsCNN) {
    for (int i = 0; i < numbOfWeingtsCNN; i++) {
        conV(layersCNN.get(((layersCNN.size()) - 1)).getLayer(), weightsCNN.get(i).getWeights());
        reLU();
    }
    weightsCNN.add(new sample.WeightsCNN(5, 5, 1000));
    fC(weightsCNN);
}