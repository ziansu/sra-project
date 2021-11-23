private float calMaxSimilarity(java.lang.String centerWord, java.util.List<java.lang.String> wordList) {
    float max = -1;
    if (wordList.contains(centerWord)) {
        return 1;
    }else {
        for (java.lang.String word : wordList) {
            float temp = wordSimilarity(centerWord, word);
            if (temp == 0)
                continue;
            
            if (temp > max) {
                max = temp;
            }
        }
    }
    if (max == (-1))
        return 0;
    
    return max;
}