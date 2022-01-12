public void initialize() {
    for (int i = 0; i < (pop.length); i++) {
        NeuralNet n = new NeuralNet(5, 5, 5);
        setNum(n, i);
    }
}