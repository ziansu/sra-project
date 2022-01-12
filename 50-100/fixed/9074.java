private eu.interedition.collatex.dekker.LCP_Interval[] construct_LCP_interval_array() {
    eu.interedition.collatex.dekker.LCP_Interval[] lcp_interval_array = new eu.interedition.collatex.dekker.LCP_Interval[token_array.size()];
    for (eu.interedition.collatex.dekker.LCP_Interval interval : lcp_intervals) {
        if ((interval.length) == 0) {
            continue;
        }
        for (int i = interval.start; i <= (interval.end); i++) {
            int tokenIndex = suffix_array[i];
            lcp_interval_array[tokenIndex] = interval;
        }
    }
    return lcp_interval_array;
}