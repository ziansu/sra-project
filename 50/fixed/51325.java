public void run() {
    long ownedEntryCount = context.stats.getOwnedEntryCount();
    org.junit.Assert.assertTrue(java.lang.String.format("Near Cache owned entry count didn't reach the desired value (%d vs. %d) (%s)", ownedEntryCount, nearCacheSize, context.stats), (ownedEntryCount == nearCacheSize));
}