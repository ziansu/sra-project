public void predict(int numbOfWeingtsCNN) {
    for (int i = 0; i < (numbOfWeingtsCNN - 1); i++) {
        conV(layersCNN.get(i).getLayer(), weightsCNN.get(i).getWeights());
        reLU();
    }
    fC(weightsCNN);
}