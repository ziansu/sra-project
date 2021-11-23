private void registerRandomBuyNow() {
    java.util.Random rand = new java.util.Random();
    long buyerId = (java.lang.Math.abs(rand.nextLong())) % (org.imdea.benchmark.rubis.RUBiSBenchmark.INITIAL_USERS);
    long itemId = (java.lang.Math.abs(rand.nextLong())) % (org.imdea.benchmark.rubis.RUBiSBenchmark.INITIAL_ITEMS);
    int qty = 1;
    mClient.storeBuyNow(buyerId, itemId, qty);
}