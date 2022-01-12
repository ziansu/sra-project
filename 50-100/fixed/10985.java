@java.lang.Override
public void setComparisonMatches(java.util.List<uk.ac.ebi.pride.spectracluster.util.ComparisonMatch> comparisonMatches) {
    this.bestComparisonMatches.clear();
    if ((comparisonMatches != null) && ((comparisonMatches.size()) > 0)) {
        this.bestComparisonMatches.addAll(comparisonMatches);
        java.util.Collections.sort(bestComparisonMatches);
        lowestBestComparisonSimilarity = bestComparisonMatches.get(0).getSimilarity();
    }else {
        lowestBestComparisonSimilarity = 0;
    }
    bestComparisonMatchIds = null;
}