public int segmentSampleSize(int hitCount, int indexDocuments, int segmentDocuments) {
    if (fixedHeuristicSample) {
        return ((int) (heuristicSampleSize.contains(".") ? (java.lang.Double.parseDouble(heuristicSampleSize)) * segmentDocuments : java.lang.Integer.parseInt(heuristicSampleSize)));
    }
    double factor = (1.0 - ((hitCount / indexDocuments) * (heuristicSampleF))) + (heuristicSampleC);
    return ((int) ((java.lang.Math.max(factor, heuristicSampleMinFactor)) * segmentDocuments));
}