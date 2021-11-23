private void updateSingleSetOfWeights(double[] weights, double[] weightsDerivatives, double[] weightsGrad) {
    for (int i = 0; i < (weightsDerivatives.length); ++i) {
        if (0 == (weightsGrad[i])) {
            weightsDerivatives[i] *= 10 * (NeuralNetwork.learningRate);
        }
        weightsDerivatives[i] *= (NeuralNetwork.learningRate) / (java.lang.Math.sqrt(weightsGrad[i]));
    }
    common.MatrixOperations.subtractInline(weights, weightsDerivatives);
}