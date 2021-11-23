public void getReleasedFrom(java.lang.String name) {
    ackFromAll.remove(name);
    releasedReceicedMap.put(name, true);
    getReleasedCount += 1;
}