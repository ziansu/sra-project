public com.hobbes.wstore.FileByteChanges evict() {
    com.hobbes.wstore.Path least = lru[currLeast];
    lru[currLeast] = null;
    com.hobbes.wstore.FileByteChanges ret = table.remove(least);
    ret.writeLog();
    currLeast = ((currLeast) + 1) % (size);
}