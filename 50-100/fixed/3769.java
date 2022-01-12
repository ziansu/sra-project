public synchronized long generateId() {
    long val;
    if (first) {
        first = false;
        return (java.lang.Long.MAX_VALUE) / 2;
    }
    val = rand.nextLong();
    while ((internalFindById(val, root)) != null) {
        val = rand.nextLong();
    } 
    return val;
}