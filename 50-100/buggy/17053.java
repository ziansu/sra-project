public float wordSimilarity(java.lang.String word1, java.lang.String word2) {
    if ((loadModel) == false) {
        return -1;
    }
    float[] word1Vec = getWordVector(word1);
    float[] word2Vec = getWordVector(word2);
    if ((word1Vec == null) || (word2Vec == null)) {
        return -1;
    }
    return calDist(word1Vec, word2Vec);
}