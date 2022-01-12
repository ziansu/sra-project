public void createPredictors() throws java.lang.Exception {
    for (java.lang.String dataFileName : getDataFileNames()) {
        java.io.File trainingDataFile = new java.io.File(getClass().getResource((("/data/" + dataFileName) + ".csv")).toURI());
        java.lang.System.out.println(trainingDataFile);
        com.zalas.traffic.dynamic.prediction.network.NeuralNetworkPredictor predictor = createPredictor(trainingDataFile);
        predictor.save((((getNetworksOutputDirectory()) + dataFileName) + ".nnp"));
        java.lang.System.out.println(((dataFileName + " predictor saved in ") + (getNetworksOutputDirectory())));
    }
}