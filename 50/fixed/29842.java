public int getRandomCoolThingIndex() {
    if ((mListOfCoolThings) == null)
        return 0;
    
    java.util.Random rand = new java.util.Random();
    return rand.nextInt(mListOfCoolThings.size());
}