private org.apache.lucene.search.TopDocs _getGoodHits(int[] goodChoiceIndexes) {
    java.util.List<org.apache.lucene.search.ScoreDoc> approvedHits = new java.util.ArrayList<org.apache.lucene.search.ScoreDoc>();
    for (int i = 0; i < (goodChoiceIndexes.length); i++)
        approvedHits.add(_hits[((goodChoiceIndexes[i]) - 1)]);
    
    return new org.apache.lucene.search.TopDocs(approvedHits.size(), approvedHits.toArray(new org.apache.lucene.search.ScoreDoc[approvedHits.size()]), 1000.0F);
}