private static double getScoreForDocumentId(int documentId, org.terrier.querying.SearchRequest srq) {
    org.terrier.matching.ResultSet rs = srq.getResultSet();
    int[] docIds = rs.getDocids();
    double[] scores = rs.getScores();
    for (int i = 0; i < (docIds.length); i++) {
        if ((docIds[i]) == documentId) {
            return scores[i];
        }
    }
    return 0;
}