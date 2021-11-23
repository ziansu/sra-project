public com.dexecutor.executor.graph.Graph.Node<T> call() throws java.lang.Exception {
    try {
        com.dexecutor.executor.TaskProvider.Task task = taskProvider.provid(node.getValue());
        task.execute();
    } catch (java.lang.Exception ex) {
        com.dexecutor.executor.DefaultDependentTasksExecutor.logger.error(("Exception caught, executing task :" + (node.getValue())), ex);
    }
    return node;
}