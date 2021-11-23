private ch.bfh.bti7535.w2016.data.Document test(ch.bfh.bti7535.w2016.data.Document document) {
    int classifiedPositive = 0;
    int classifiedNegative = 0;
    for (ch.bfh.bti7535.w2016.algorithm.features.AbstractFeature feature : featurePipeline) {
        classifiedPositive += calcProbabilityTimesOccurrence(feature, Classification.SENTIMENT_POSITIVE);
        classifiedNegative += calcProbabilityTimesOccurrence(feature, Classification.SENTIMENT_NEGATIVE);
    }
    document.setTestResult((classifiedPositive > classifiedNegative ? ch.bfh.bti7535.w2016.data.Classification.SENTIMENT_POSITIVE : ch.bfh.bti7535.w2016.data.Classification.SENTIMENT_NEGATIVE));
    return document;
}