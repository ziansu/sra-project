public int compare(ScoredDocument doc1, ScoredDocument doc2) {
    if ((doc1.getScore()) < (doc2.getScore())) {
        return -1;
    }else
        if ((doc1.getScore()) > (doc2.getScore())) {
            return 1;
        }
    
    return 0;
}