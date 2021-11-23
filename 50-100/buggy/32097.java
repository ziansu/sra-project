private void updateMinDownsampledSize() {
    int min = java.lang.Integer.MAX_VALUE;
    for (java.util.List<wekimini.learning.dtw.DtwExample> list : allExamples) {
        for (wekimini.learning.dtw.DtwExample ex : list) {
            if ((ex.getDownsampledTimeSeries().size()) < min) {
                min = ex.getTimeSeries().size();
            }
        }
    }
    minSizeInDownsampledExamples = min;
}