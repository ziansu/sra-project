public static void runDebugTest(java.lang.String[] args) throws java.lang.Exception {
    java.io.File dataDir = new java.io.File(args[0]);
    java.lang.String filenamePrefix = args[1];
    org.eclipse.rdf4j.sail.nativerdf.btree.BTree btree = new org.eclipse.rdf4j.sail.nativerdf.btree.BTree(dataDir, filenamePrefix, 28, 1);
    btree.print(java.lang.System.out);
}