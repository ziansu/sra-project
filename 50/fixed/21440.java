private static int getPredictionsCount(hex.genmodel.MojoModel model) {
    return model.isClassifier() ? model.nclasses() : 1;
}