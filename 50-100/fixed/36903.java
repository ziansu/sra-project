public void addInputData(java.util.List<java.lang.Double> inputValues) {
    validateInputValues(inputValues);
    for (pl.kordulewski.ai.neuralnetwork.Neuron inputNeuron : neuronsInInputLayer) {
        inputNeuron.cleanSources();
        for (java.lang.Double inputValue : inputValues) {
            inputNeuron.registerSource(new pl.kordulewski.ai.neuralnetwork.StaticSource(inputValue));
        }
    }
}