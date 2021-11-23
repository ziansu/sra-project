@java.lang.Override
public double getRequestScore(java.lang.String documentNumber) {
    double score = 0;
    int dl = index.getDl(documentNumber, "/article");
    for (java.lang.String word : this.request.split("\\W")) {
        score += getDocumentWordScore(word, getTermFrequency(index, word, documentNumber), dl, N, avdl);
    }
    return score;
}