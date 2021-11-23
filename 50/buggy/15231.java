@java.lang.Override
public void stop() throws java.lang.Exception {
    com.inspirationlogical.receipt.corelib.model.transaction.EntityManagerProvider.closeEntityManager();
    com.inspirationlogical.receipt.corelib.model.transaction.EntityManagerProvider.closeEntityManagerArchive();
}