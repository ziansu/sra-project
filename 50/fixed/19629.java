@at.tuwien.aic.tweetanalysis.Command
public void testAgainstTweets() throws java.lang.Exception {
    java.lang.System.out.println("Test classifier against a manually created testing-set...");
    java.util.List<at.tuwien.aic.tweetanalysis.entities.Tweet> t = at.tuwien.aic.tweetanalysis.preprocessing.TrainingDataPreprocessor.preprocessAndCreateTweets(standardTweetPreprocessor, "/trainingData/manuallyCreatedTraindata/tweets.csv", 600);
    classifier.testClassifierAgainstPreprocessedTweets(t, true);
    java.lang.System.out.println("done");
}