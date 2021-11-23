private float calMaxSimilarity(java.lang.String centerWord, java.util.List<java.lang.String> wordList) {
    float max = 0;
    if (wordList.contains(centerWord)) {
        return 1;
    }else {
        for (java.lang.String word : wordList) {
            float temp = wordSimilarity(centerWord, word);
            if (temp > max) {
                max = temp;
            }
        }
    }
    return max;
}