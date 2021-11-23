public int encodedIndex(double sourceWord) {
    int bestIndex = 0;
    for (int i = 0; i < (SIZE); i++) {
        if ((java.lang.Math.abs(((codebook.get(i)) - sourceWord))) < (java.lang.Math.abs(((codebook.get(bestIndex)) - sourceWord))))
            bestIndex = i;
        
    }
    return bestIndex;
}