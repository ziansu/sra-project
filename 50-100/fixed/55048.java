private double[] trainLocal() throws java.io.IOException {
    final java.util.Set<edu.uw.easysrl.syntax.training.Feature.FeatureKey> boundedFeatures = new java.util.HashSet<>();
    final java.util.List<edu.uw.easysrl.syntax.training.Optimization.TrainingExample> data = makeTrainingData(false);
    final edu.uw.easysrl.syntax.training.Optimization.LossFunction lossFunction = edu.uw.easysrl.syntax.training.Optimization.getLossFunction(data, featureToIndex, trainingParameters, trainingLogger);
    final double[] weights = train(lossFunction, featureToIndex, boundedFeatures);
    return weights;
}