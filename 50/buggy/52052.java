public static void initFileLogAndBufferMgr(java.lang.String dirname) {
    simpledb.server.SimpleDB.initFileAndLogMgr(dirname);
    simpledb.server.SimpleDB.bm = new simpledb.server.BufferMgr(simpledb.server.SimpleDB.BUFFER_SIZE);
    java.lang.System.out.println("Called Buffer mgr from simpleDb.java");
}