public void backPropagationRAM(double[] image, int expectedResult, double learningFactor) throws java.io.IOException, java.lang.ClassNotFoundException {
    assert (image.length) == 784;
    int[] expected = new int[10];
    java.util.Arrays.fill(expected, (-1));
    expected[expectedResult] = 1;
    this.forwardPropagationRAM(image);
    for (int i = 0; i < (neuronalnetworks.NeuronalNetworks.nombreIterationsBackprop); i++) {
        this.layers[2].backprop_init(expected, learningFactor);
    }
}