public double getDocumentsRetrievalScore(java.util.List<com.technion.ir.dao.RetrivalResult> results) {
    double denominatorScore = 0;
    for (com.technion.ir.dao.RetrivalResult retrivalResult : results) {
        denominatorScore += retrivalResult.getScore();
    }
    return denominatorScore;
}