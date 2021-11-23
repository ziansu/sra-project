public static void createThreadsForInsert(int i, java.util.List<java.lang.Integer> listInteger) {
    Tester.threadObj[i] = new Threads(java.lang.Integer.toString(i), i, Threads.testInsert, Tester.listIT, listInteger);
}