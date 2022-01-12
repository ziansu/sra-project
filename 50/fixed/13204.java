@java.lang.Override
protected int getCsvReaderLimit() {
    int connLimit = super.getCsvReaderLimit();
    int analysisLimit = getLimitNumber(this.analysis);
    if (connLimit <= 0) {
        return analysisLimit;
    }
    return analysisLimit < connLimit ? analysisLimit : connLimit;
}