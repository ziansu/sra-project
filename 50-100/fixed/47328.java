public void calculateLowerDeltas() {
    for (int j = 0; j < ((upperWeights.length) - 1); j++) {
        for (int i = 0; i < (upperDeltas.length); i++) {
            lowerDeltas[j] = (upperDeltas[i]) * (dWupper[j][i]);
        }
        lowerDeltas[j] = (lowerDeltas[j]) * (neuralnet.Sigmoid.derivative(hiddenNeuronsValues[j]));
    }
}