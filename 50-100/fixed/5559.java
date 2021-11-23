public com.dexecutor.executor.graph.Graph.Node<T> call() throws java.lang.Exception {
    try {
        com.dexecutor.executor.TaskProvider.Task task = taskProvider.provid(this.node.getValue());
        task.execute();
    } catch (java.lang.Exception ex) {
        com.dexecutor.executor.DefaultDependentTasksExecutor.logger.error(("Exception caught, executing task :" + (this.node.getValue())), ex);
    }
    return this.node;
}