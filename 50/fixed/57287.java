private void issueRandomSearchItemsByCategory() {
    java.util.Random rand = new java.util.Random();
    long categoryId = (java.lang.Math.abs(rand.nextLong())) % (org.imdea.benchmark.rubis.RUBiSBenchmark.INITIAL_CATEGORIES);
    mClient.searchItemByCategory(categoryId);
}