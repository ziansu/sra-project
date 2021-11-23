public static void main(java.lang.String[] args) {
    edu.ucla.cs.cs144.Indexer idx = new edu.ucla.cs.cs144.Indexer();
    try {
        idx.rebuildIndexes();
    } catch (java.lang.Exception e) {
        java.lang.System.out.prinln(e);
    }
}