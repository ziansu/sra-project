public long time(int[] mutations) {
    long start = java.lang.System.currentTimeMillis();
    for (i = 0; (i) < (mutations.size()); (i)++) {
        if ((i) > 0) {
            insert(mutations[i]);
        }else {
            extract(mutations[i]);
        }
    }
    long end = java.lang.System.currentTimeMillis();
    return end - start;
}