@java.lang.Override
public void beforeCommit(boolean readOnly) {
    transactionSynchronizationTaskManagerService.merge();
    fr.openwide.core.jpa.more.util.transaction.model.TransactionSynchronizationTasks tasks = transactionSynchronizationTaskManagerService.getTasks();
    if (tasks == null) {
        return ;
    }
    for (fr.openwide.core.jpa.more.util.transaction.model.ITransactionSynchronizationBeforeCommitTask beforeCommitTask : tasks.getBeforeCommitTasks()) {
        try {
            beforeCommitTask.run();
        } catch (java.lang.Exception e) {
            throw new fr.openwide.core.jpa.more.util.transaction.exception.TransactionSynchronizationException("Error while executing a 'before commit' task.", e);
        }
    }
}