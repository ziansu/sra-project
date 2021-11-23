@java.lang.Override
public void run() {
    for (com.frostwire.search.KeywordDetector.Feature feature : filteredHistograms.keySet()) {
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.Integer>> filteredHistogram = filteredHistograms.get(feature);
        keywordFilterDrawerView.updateData(feature, filteredHistogram);
    }
    updateVisibility();
    keywordFilterDrawerView.requestLayout();
}