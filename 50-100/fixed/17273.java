private static void linearDump(long[] inRange, java.util.List<java.lang.Long> values, int maxLen) {
    long d0 = inRange[0];
    long d1 = inRange[1];
    for (long i = d0; i <= d1; i++) {
        if ((values.size()) < maxLen) {
            values.add(i);
        }else {
            return ;
        }
    }
}