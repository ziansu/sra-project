public java.util.ArrayList<org.nd4j.linalg.api.ndarray.INDArray> getTestImportance() {
    java.util.ArrayList<org.nd4j.linalg.api.ndarray.INDArray> weights = getNetworkWeights();
    java.util.ArrayList<org.nd4j.linalg.api.ndarray.INDArray> importances = new java.util.ArrayList<>();
    for (int i = 0; i < (trainData.numExamples()); i++) {
        importances.add(getDatumImportance(weights, testData.get(i).getFeatures()));
    }
    return importances;
}