private boolean isTempReportOutdated() {
    if (!(isTempReportGenerated())) {
        return true;
    }
    java.lang.String[] sources = scanForSources();
    long latestModificationInSource = 0;
    for (java.lang.String string : sources) {
        latestModificationInSource = java.lang.Math.max(latestModificationInSource, new java.io.File(string).lastModified());
    }
    return latestModificationInSource > (new java.io.File(buildOutputFileName()).lastModified());
}