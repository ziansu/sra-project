private data.Vector calculateMeanPoint(java.util.List<? extends data.Data> dataSet) {
    double[] meanPoint = new double[argumentsCount];
    for (data.Data data : dataSet) {
        for (int i = 0; i < (argumentsCount); i++) {
            meanPoint[i] += data.getValueAt(i);
        }
    }
    for (int i = 0; i < (argumentsCount); i++) {
        meanPoint[i] /= dataSet.size();
    }
    return new data.Vector(meanPoint);
}