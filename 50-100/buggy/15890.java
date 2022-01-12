private ddf.catalog.data.Result updateResult(ddf.catalog.data.Result origResult, float newScore) {
    ddf.catalog.data.impl.ResultImpl result = new ddf.catalog.data.impl.ResultImpl(origResult.getMetacard());
    result.setRelevanceScore(new java.lang.Double(newScore));
    result.setDistanceInMeters(origResult.getDistanceInMeters());
    return result;
}