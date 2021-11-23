@java.lang.Override
public void run() {
    java.util.List<com.frostwire.search.KeywordFilter> keywordFiltersPipeline = getKeywordFiltersPipeline();
    keywordFilterDrawerView.updateAppliedKeywordFilters(keywordFiltersPipeline);
    for (com.frostwire.search.KeywordDetector.Feature feature : filteredHistograms.keySet()) {
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.Integer>> filteredHistogram = filteredHistograms.get(feature);
        keywordFilterDrawerView.updateData(feature, filteredHistogram);
    }
    updateVisibility();
    keywordFilterDrawerView.requestLayout();
}