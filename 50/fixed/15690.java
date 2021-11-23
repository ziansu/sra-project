public static Threads createThreadsForInsert(int i, java.util.List<java.lang.Integer> listInteger) {
    return new Threads(java.lang.Integer.toString(i), i, Threads.testInsert, Tester.listIT, listInteger);
}