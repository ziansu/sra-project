private double[] generateTargets(java.util.ArrayList<double[]> dataSet) {
    double[] targets = new double[dataSet.size()];
    for (int i = 0; i < (dataSet.size()); i++) {
        targets[i] = dataSet.get(i)[((dataSet.get(i).length) - 1)];
    }
    return targets;
}