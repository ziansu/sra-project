private void saveFilterSet(gdsc.smlm.results.filter.FilterSet filterSet, int setNumber) {
    stopTimer();
    java.lang.String filename = gdsc.smlm.ij.plugins.BenchmarkFilterAnalysis.getFilename(("Filter_set_" + setNumber), gdsc.smlm.ij.plugins.BenchmarkFilterAnalysis.filterSetFilename);
    if (filename != null) {
        gdsc.smlm.ij.plugins.BenchmarkFilterAnalysis.filterSetFilename = filename;
        gdsc.smlm.ij.plugins.BenchmarkFilterAnalysis.saveFilterSet(filterSet, filename);
    }
    startTimer();
}