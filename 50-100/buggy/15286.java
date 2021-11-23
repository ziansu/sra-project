public boolean isReliable(java.util.List<java.lang.String> contexts_pattern, int dataSize, java.util.Set<java.lang.String> reliableInstances, java.util.Set<io.github.infolis.model.StudyContext> contexts_seeds, io.github.infolis.infolink.patternLearner.Reliability r) throws java.io.IOException, org.apache.lucene.queryParser.ParseException {
    this.setReliability(r.computeReliability(contexts_pattern, dataSize, reliableInstances, contexts_seeds, this));
    if ((this.getReliability()) >= (this.getThreshold())) {
        return true;
    }else {
        return false;
    }
}