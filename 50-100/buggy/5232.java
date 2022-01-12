public recurrentNeuralNetwork.lstmNetwork.Network makeLSTM(int inputAmount, int hiddenAmount, int hiddenLayers, int outputAmount) {
    layers = new java.util.ArrayList<>();
    for (int i = 0; i < hiddenLayers; i++) {
        if (i == 0)
            layers.add(new recurrentNeuralNetwork.lstmNetwork.Layer(inputAmount, hiddenAmount, outputAmount));
        else
            layers.add(new recurrentNeuralNetwork.lstmNetwork.Layer(hiddenAmount, hiddenAmount, outputAmount));
        
    }
    return new recurrentNeuralNetwork.lstmNetwork.Network(layers);
}