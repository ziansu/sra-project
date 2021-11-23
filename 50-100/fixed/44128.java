public static void Classify(java.lang.String trainingFilePath, java.lang.String testFilePath) throws java.lang.Exception {
    shinylearner.core.Log.Debug("Classifying.");
    long startTime = java.lang.System.nanoTime();
    java.lang.String predictionOutput = shinylearner.core.Classification.TrainTest(trainingFilePath, testFilePath);
    shinylearner.core.Log.Debug(predictionOutput);
    shinylearner.core.OutputFileProcessor.AddBenchmarkOutputLine(shinylearner.core.Benchmark.GetBenchmarkValues(startTime), false);
    shinylearner.core.OutputFileProcessor.AddPredictionOutputLine(shinylearner.core.Classification.GetPredictionOutput(shinylearner.core.Classification.ParsePredictions(predictionOutput, Singletons.ExperimentItems.TestIDs)), false);
}