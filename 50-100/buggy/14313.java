public float getMatchingScore(final de.uni_tuebingen.ub.ixTheo.bibleRangeSearch.Range other) {
    final float numerator = (java.lang.Math.min(upper, other.upper)) - (java.lang.Math.max(lower, other.lower));
    final float denominator = (java.lang.Math.max(upper, other.upper)) - (java.lang.Math.min(lower, other.lower));
    return numerator / denominator;
}