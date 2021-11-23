public void flatline(double outputs, double inputs) {
    for (int i = 0; i < outputs; i++) {
        double total = inputs;
        for (int j = 0; j < (inputs + 1); j++) {
            this.weights[i][j] = 1 / total;
        }
    }
}