@java.lang.Override
public void run() {
    com.orientechnologies.orient.core.db.document.ODatabaseDocument db = new com.orientechnologies.orient.core.db.document.ODatabaseDocumentTx(dbUrl);
    try {
        db.open(userName, password);
        run(db);
    } finally {
        runningThreads.decrementAndGet();
        synchronized(runningThreads) {
            runningThreads.notifyAll();
        }
        db.activateOnCurrentThread();
        db.close();
    }
}