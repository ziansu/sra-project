public java.lang.String getRandomNextWord(java.util.Random generator) {
    if ((nextWords.size()) < 1)
        return null;
    
    if ((nextWords.size()) == 1)
        return nextWords.get(0);
    
    int ind = generator.nextInt(nextWords.size());
    return nextWords.get(ind);
}