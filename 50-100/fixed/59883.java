private de.aphol.java.neuronet.network.components.ActingNeuron getRandomNeuron() {
    int targetNeuronLayerIndex = this.randomGenerator.nextInt(((this.hiddenNeuronTable.size()) + 1));
    if (targetNeuronLayerIndex == (this.hiddenNeuronTable.size())) {
        return getRandomOutputNeuron();
    }else {
        return getRandomHiddenNeuron();
    }
}