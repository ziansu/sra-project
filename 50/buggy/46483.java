public void doTransactionRead(voldemort.performance.benchmark.VoldemortWrapper db) {
    java.lang.Object key = keyProvider.next(insertKeyProvider.lastInt());
    java.lang.System.out.println(("Get " + key));
    db.read(key, this.value);
}