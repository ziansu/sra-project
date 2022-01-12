private int getFreeId(java.lang.Integer[] ints) {
    java.util.List blacklist = scala.actors.threadpool.Arrays.asList(ints);
    for (int i = -65535; i < 65535; i++) {
        if ((!(book.idExists(i))) && (!(blacklist.contains(i)))) {
            return i;
        }
    }
    throw new java.lang.RuntimeException("Could not find an empty ID for buttons");
}