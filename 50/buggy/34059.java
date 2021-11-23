void runExperiment() throws java.io.IOException {
    java.util.ArrayList<edu.isr.data.Fold> embeddingFolds = edu.isr.data.InputHandler.readFolds(params, false);
    for (edu.isr.data.Fold currFold : embeddingFolds) {
        currFold.normalizeData();
        currFold.assignRanks(params);
    }
}