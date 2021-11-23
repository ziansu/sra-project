private macrobase.analysis.result.AnalysisResult analyze() throws java.io.IOException, java.sql.SQLException, macrobase.conf.ConfigurationException {
    if (contextualEnabled) {
        return contextualAnalyze();
    }
    macrobase.analysis.summary.Summary result = summarizer.next();
    return new macrobase.analysis.result.AnalysisResult(summarizer.getNumInliers(), summarizer.getNumOutliers(), result.getItemsets());
}