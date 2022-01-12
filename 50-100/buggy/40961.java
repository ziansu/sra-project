public double[] calculateOutput(data.Vector v) {
    double[] output = new double[outputVectorSize];
    for (int j = 0; j < (outputVectorSize); j++) {
        output[j] = getW0(j);
        for (int i = 0; i < (neurons.length); i++) {
            output[j] += (neurons[i].output(v)) * (weights[j][i]);
        }
    }
    return output;
}