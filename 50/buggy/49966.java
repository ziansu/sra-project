public long getLowestId() {
    long currentMinId = tweets.get(((tweets.size()) - 1)).getUid();
    return currentMinId;
}