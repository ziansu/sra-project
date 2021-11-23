private org.atlasapi.equiv.results.scores.Score score(java.util.List<java.lang.Integer> subjSeriesSizes, org.atlasapi.media.entity.Container cand, org.atlasapi.equiv.results.description.ResultDescription desc) {
    if (!(cand instanceof org.atlasapi.media.entity.Brand)) {
        desc.appendText("%s: not Brand -> %.2f", cand, mismatchScore.asDouble());
        return mismatchScore;
    }
    return score(subjSeriesSizes, ((org.atlasapi.media.entity.Brand) (cand)), desc);
}