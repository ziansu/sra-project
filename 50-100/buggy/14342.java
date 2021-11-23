public static void main(final java.lang.String[] args) throws java.lang.Exception {
    if ((args.length) != 1) {
        java.lang.System.err.println("Usage: programm <adapter>");
        java.lang.System.exit((-1));
    }
    final java.lang.String adapter = java.util.Objects.requireNonNull(args[0]);
    if (TupleStoreFactory.ALL_STORES.contains(adapter)) {
        java.lang.System.err.println(("Unknown adapter: " + adapter));
        java.lang.System.exit((-1));
    }
    final org.bboxdb.tools.experiments.TestRWPerformance testSplit = new org.bboxdb.tools.experiments.TestRWPerformance(adapter);
    testSplit.run();
}