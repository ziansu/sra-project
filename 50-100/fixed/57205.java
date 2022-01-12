@org.junit.BeforeClass
public static void loadTrainingData() throws com.aic.sentiment_analysis.preprocessing.PreprocessingException, java.io.FileNotFoundException, java.net.URISyntaxException {
    com.aic.sentiment_analysis.classification.CSVTrainingSampleLoader sampleLoader = new com.aic.sentiment_analysis.classification.CSVTrainingSampleLoader();
    com.aic.sentiment_analysis.classification.CSVTrainingSTSLoader trainLoader = new com.aic.sentiment_analysis.classification.CSVTrainingSTSLoader();
    com.aic.sentiment_analysis.classification.EvaluationTest.trainingSamples = trainLoader.load(com.aic.sentiment_analysis.classification.EvaluationTest.class.getClassLoader().getResource(Constants.CLASSIFIER_TRAINING_FILE_PATH).toURI());
    com.aic.sentiment_analysis.classification.EvaluationTest.testSamples = sampleLoader.load(com.aic.sentiment_analysis.classification.EvaluationTest.class.getClassLoader().getResource(com.aic.sentiment_analysis.classification.EvaluationTest.PATH_TO_TEST_DATA).toURI());
}