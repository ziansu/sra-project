@java.lang.Override
protected int getCsvReaderLimit() {
    int connLimit = super.getCsvReaderLimit();
    int analysisLimit = getLimitNumber(this.analysis);
    return analysisLimit < connLimit ? analysisLimit : connLimit;
}