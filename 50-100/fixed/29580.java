public boolean useSegmentHeuristics(int indexHitCount, int indexDocuments, int segmentDocuments) {
    if ((!(heuristic)) || (segmentDocuments < (heuristicMinDocs))) {
        return false;
    }
    if (fixedHeuristicSample) {
        return true;
    }
    double factor = (1.0 - (((1.0 * indexHitCount) / indexDocuments) * (heuristicSampleF))) + (heuristicSampleC);
    return factor <= (heuristicSampleMaxFactor);
}