@org.junit.Test
public void shouldBackupAndRestoreWithExistingUserTransaction() throws java.lang.Exception {
    startRunStop(( repository) -> {
        org.modeshape.jcr.JcrSession session = repository.login();
        javax.transaction.TransactionManager txnMgr = repository.transactionManager();
        txnMgr.begin();
        makeBackup(session, BackupOptions.DEFAULT);
        this.restoreBackup();
        txnMgr.rollback();
        assertContentInWorkspace(session);
    }, true, false);
}