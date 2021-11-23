public static void trainAndSaveClassifier(java.lang.String pathToClassifierFile, java.lang.String classifierType, java.lang.String pathToData, TweetFeatureExtractor tweetFeatureExtractor) throws java.io.IOException, java.lang.ClassNotFoundException, java.lang.InterruptedException {
    MaxEntClassification classifier = new MaxEntClassification(pathToClassifierFile, runClassifierOnTweets.nCores);
    java.util.ArrayList<TweetVector> tweetVectors = tweetFeatureExtractor.getVectorModelsFromTweetsMultithreaded(pathToData, classifierType);
    classifier.addToInstanceList(tweetVectors);
    classifier.trainClassifier(classifier.instances);
    classifier.clearInstances();
    java.io.File classifierFile = new java.io.File(pathToClassifierFile);
    classifier.saveClassifier(classifierFile);
}