public boolean isReliable(java.util.Set<io.github.infolis.model.StudyContext> contexts_patterns, int dataSize, java.util.Set<java.lang.String> reliablePatterns, java.util.Set<io.github.infolis.model.StudyContext> contexts_seeds, io.github.infolis.infolink.patternLearner.Reliability r, double threshold) throws java.io.IOException, org.apache.lucene.queryParser.ParseException {
    double instanceReliability = r.computeReliability(contexts_patterns, dataSize, reliablePatterns, contexts_seeds, this);
    if (instanceReliability >= threshold) {
        return true;
    }else {
        return false;
    }
}