public java.util.ArrayList<java.lang.Short> predict(java.util.ArrayList<edu.arizona.cs.classifier.TwitterInfo> testSet) {
    java.util.ArrayList<java.lang.Short> predictions = new java.util.ArrayList<java.lang.Short>();
    for (edu.arizona.cs.classifier.TwitterInfo testUnit : testSet) {
        edu.arizona.sista.learning.RVFDatum<java.lang.String, java.lang.String> datum = populateDatum(testUnit, true);
        predictions.add(getScore(classifier.classOf(datum)));
    }
    return predictions;
}