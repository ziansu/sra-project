private void runTest(com.nfsdb.collections.experimental.NWayHashMap<java.lang.CharSequence, java.lang.CharSequence> map) {
    for (int i = 0; i < (iterations); i++) {
        java.lang.CharSequence key = keys[i];
        if ((map.get(key)) == null) {
            map.put(key, key);
        }
    }
}