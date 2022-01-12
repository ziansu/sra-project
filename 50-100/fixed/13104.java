public long time(int[] mutations) {
    long start = java.lang.System.currentTimeMillis();
    for (int item : mutations) {
        if (item > 0) {
            insert(item);
        }else {
            extract(item);
        }
    }
    long end = java.lang.System.currentTimeMillis();
    return end - start;
}