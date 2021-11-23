public java.util.List<java.lang.Integer> classify(java.util.List<Utils.DataVector> data, boolean calAccuracy) {
    for (Utils.DataVector vector : data) {
        java.util.List<java.lang.Integer> treePredictions = new java.util.ArrayList(data.size());
        for (RandomForestHOG.DecisionTree.DecisionTree tree : dTree) {
            int curPrediction = tree.classify(vector);
            treePredictions.add(curPrediction);
        }
        int forestPrediction = Utils.Helper.getModeInt(treePredictions);
        finalPredictions.add(forestPrediction);
    }
    return finalPredictions;
}