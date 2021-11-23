private double score(int row, int column, java.lang.String dnaSequence1, java.lang.String dnaSequence2, double matchScore, double mismatchPenalty) {
    if ((dnaSequence1.charAt(column)) == (dnaSequence2.charAt(row))) {
        return matchScore;
    }else {
        return (-1) * mismatchPenalty;
    }
}