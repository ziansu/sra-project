private static org.apache.lucene.util.BytesRef smallestRange(java.util.Set<org.elasticsearch.percolator.QueryAnalyzer.QueryExtraction> terms) {
    org.apache.lucene.util.BytesRef min = null;
    for (org.elasticsearch.percolator.QueryAnalyzer.QueryExtraction qt : terms) {
        if ((qt.range) != null) {
            if ((min == null) || ((qt.range.interval.compareTo(min)) < 0)) {
                min = qt.range.interval;
            }
        }
    }
    return min;
}