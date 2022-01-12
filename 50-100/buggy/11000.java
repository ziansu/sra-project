public static int findMaxArg(int upperBound, int lowerBound, int page) {
    int maxCandidate = 0;
    java.lang.Double maxCandidateValue = 0.0;
    for (int i = upperBound; i < lowerBound; i++) {
        if ((pagenumber.Viterbi.viterbiPages.get(page).get(i)) > maxCandidateValue) {
            maxCandidateValue = pagenumber.Viterbi.viterbiPages.get(page).get(i);
            maxCandidate = i;
        }
    }
    return maxCandidate;
}