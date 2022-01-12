public void addInputData(java.util.List<java.lang.Double> inputValues) {
    validateInputValues(inputValues);
    for (pl.kordulewski.ai.neuralnetwork.Neuron inputNeuron : neuronsInInputLayer) {
        for (java.lang.Double inputValue : inputValues) {
            inputNeuron.cleanSources();
            inputNeuron.registerSource(new pl.kordulewski.ai.neuralnetwork.StaticSource(inputValue));
        }
    }
}