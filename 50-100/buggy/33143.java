@java.lang.Override
public com.whizzosoftware.hobson.api.task.HobsonTask addTask(com.whizzosoftware.hobson.api.task.HobsonTask task) {
    java.lang.ClassLoader old = java.lang.Thread.currentThread().getContextClassLoader();
    try {
        java.lang.Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
        com.whizzosoftware.hobson.bootstrap.api.task.store.MapDBTaskStore.logger.debug("Adding task: {}", task.getContext().toString());
        persister.saveTask(new com.whizzosoftware.hobson.bootstrap.util.MapDBCollectionPersistenceContext(db, "tasks"), task);
        return task;
    } finally {
        java.lang.Thread.currentThread().setContextClassLoader(old);
    }
}