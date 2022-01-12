public synchronized long generateId() {
    java.util.Random rand;
    long val;
    if (first) {
        return (java.lang.Long.MAX_VALUE) / 2;
    }
    rand = new java.util.Random();
    val = rand.nextLong();
    while ((internalFindById(val, root)) != null) {
        val = rand.nextLong();
    } 
    return val;
}