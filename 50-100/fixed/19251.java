public float establishNeuronOutputFromConnections() {
    if (isInputNeuron) {
        output = input;
        return output;
    }
    if (isBiasNeuron) {
        derivative = 1;
        return (harlequinmettle.investmentadviserengine.neuralnet.ArtificialNeuron.one) * (biasNeuronWeight.weight);
    }
    float sum = 0;
    for (harlequinmettle.investmentadviserengine.neuralnet.ArtificialNeuralNetConnection connection : inputConnections) {
        sum += connection.getWeightedInput();
    }
    output = neuronTransferFunction.calculateOutput(sum);
    derivative = neuronTransferFunction.getDerivative(sum);
    return output;
}