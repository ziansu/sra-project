protected int getBinForScore(double score) {
    double doubleBin = score / (scoreIncrements);
    int index = ((int) (java.lang.Math.ceil(doubleBin)));
    if (index >= (proportionPeptidesBelowScore.size()))
        index = (proportionPeptidesBelowScore.size()) - 1;
    
    if (index < 0) {
        index = 0;
    }
    return index;
}