void addConnection(lib.neuralNetwork.Neuron synapse) {
    lib.neuralNetwork.Axion axion = new lib.neuralNetwork.Axion();
    axion.synapse = synapse;
    for (lib.neuralNetwork.Axion a : axions) {
        if (axion.equals(a)) {
            for (int i = 0; i < (a.strength); i++)
                axions.add(a);
            
            a.strength = (a.strength) << 1;
            return ;
        }
    }
    axions.add(axion);
}