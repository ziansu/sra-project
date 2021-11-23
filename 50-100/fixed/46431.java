public static void main(final java.lang.String[] args) {
    com.junyuan.neuralnetwork.NeuralNetwork XOR = new com.junyuan.neuralnetwork.NeuralNetwork(2, 4, 1, 0.2, 0.0, com.junyuan.main.Main.XOR_INPUT, com.junyuan.main.Main.XOR_IDEAL);
    do {
        XOR.train();
        (com.junyuan.main.Main.epch)++;
    } while (((XOR.gettotalError()) > 0.05) && ((com.junyuan.main.Main.epch) < 30000) );
}