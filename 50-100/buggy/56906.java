public boolean[] getActiviationOfHiddenNeurons() {
    boolean[] activation = new boolean[neuroidAccessor.getNumberOfNeurons(NeuronAdress.EnumType.HIDDEN)];
    for (int hiddenNeuronIndex = 0; hiddenNeuronIndex < 0; hiddenNeuronIndex++) {
        activation[hiddenNeuronIndex] = neuroidAccessor.getNeuroidAccessorByAdress(new ptrman.mltoolset.Neuroid.NeuronAdress(hiddenNeuronIndex, NeuronAdress.EnumType.HIDDEN)).getFiring();
    }
    return activation;
}