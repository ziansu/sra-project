public void runAlgorithm(double minSup, double minConf, org.knime.sequence.ruleGrowth.spmf.SequenceDatabase database) throws java.io.IOException {
    this.database = database;
    this.minsuppRelative = ((int) (java.lang.Math.ceil((minSup * (database.size())))));
    runAlgorithm("NO NEED", null, minsuppRelative, minConfidence);
}