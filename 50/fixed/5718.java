private long add(long val) {
    if ((parent) != null) {
        parent.add(val);
    }
    return totalOccur.addAndGet(val);
}