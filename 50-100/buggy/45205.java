private void runTest(com.nfsdb.collections.experimental.NWayHashMap<java.lang.Integer, java.lang.Integer> map) {
    com.nfsdb.utils.Rnd rnd = new com.nfsdb.utils.Rnd(java.lang.System.currentTimeMillis(), java.lang.System.nanoTime());
    for (int i = 0; i < (iterations); i++) {
        int key = rnd.nextInt();
        if ((map.get(key)) == null) {
            map.put(key, rnd.nextInt());
        }
    }
}