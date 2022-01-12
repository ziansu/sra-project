@com.twitter.common.inject.TimedInterceptor.Timed(value = "mem_storage_delete_tasks")
@java.lang.Override
public void deleteTasks(java.util.Set<java.lang.String> taskIds) {
    com.google.common.base.Preconditions.checkNotNull(taskIds);
    for (java.lang.String id : taskIds) {
        org.apache.aurora.scheduler.storage.mem.MemTaskStore.Task removed = tasks.remove(id);
        if (removed != null) {
            for (org.apache.aurora.scheduler.storage.mem.MemTaskStore.SecondaryIndex<?> index : secondaryIndices) {
                index.remove(removed);
            }
            configInterner.removeAssociation(removed.task.getAssignedTask().getTask().newBuilder(), id);
        }
    }
}