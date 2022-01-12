public void getReleasedFrom(java.lang.String name) {
    ackFromAll.remove(name);
    if ((releasedReceicedMap.put(name, true)) == null) {
        getReleasedCount += 1;
    }
}