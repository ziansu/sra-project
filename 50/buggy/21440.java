private static int getPredictionsCount(hex.genmodel.MojoModel model) {
    return model.isClassifier() ? 1 : model.nclasses();
}