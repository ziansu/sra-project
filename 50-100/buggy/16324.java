public double getWeightInputSum(double[] inputs) throws java.lang.Exception {
    if ((inputs.length) != ((this.inputCount) - 1)) {
        throw new java.lang.Exception("Inputs to node do not match node input count!");
    }
    double result = this.weights[inputs.length];
    for (int i = 0; i < (this.inputCount); i++) {
        result += (this.weights[i]) * (inputs[i]);
    }
    return result;
}