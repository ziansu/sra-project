private macrobase.analysis.result.AnalysisResult analyze() throws java.io.IOException, java.sql.SQLException, macrobase.conf.ConfigurationException {
    if (contextualEnabled) {
        contextualAnalyze();
    }
    ingester = constructIngester(conf);
    featureTransform = new macrobase.transform.BatchScoreFeatureTransform(conf, ingester, conf.getDetectorType());
    outlierClassifier = new macrobase.analysis.classify.BatchingPercentileClassifier(conf, featureTransform);
    summarizer = new macrobase.analysis.summary.BatchSummarizer(conf, outlierClassifier);
    macrobase.analysis.summary.Summary result = summarizer.next();
    return new macrobase.analysis.result.AnalysisResult(summarizer.getNumInliers(), summarizer.getNumOutliers(), result.getItemsets());
}