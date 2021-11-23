@java.lang.Override
public void init() {
    if (com.inspirationlogical.receipt.manager.application.ManagerApp.testApplication) {
        com.inspirationlogical.receipt.corelib.model.transaction.EntityManagerProvider.getTestEntityManager();
        com.inspirationlogical.receipt.corelib.model.transaction.EntityManagerProvider.getTestEntityManagerArchive();
    }
}