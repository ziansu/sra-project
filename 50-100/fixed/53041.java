private java.util.ArrayList<java.lang.Long> getLatest(int wantedNumber) {
    java.util.ArrayList<java.lang.Long> latestArticles = new java.util.ArrayList<java.lang.Long>();
    if (!(existingItemIds.isEmpty())) {
        for (int i = 1; i <= wantedNumber; i++) {
            latestArticles.add(existingItemIds.get(((existingItemIds.size()) - i)));
        }
    }
    return latestArticles;
}