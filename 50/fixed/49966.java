public long getLowestId() {
    if ((tweets.size()) < 1)
        return -1;
    
    long currentMinId = tweets.get(((tweets.size()) - 1)).getUid();
    return currentMinId;
}