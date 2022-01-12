public com.dexecutor.executor.graph.Graph.Node<T> call() throws java.lang.Exception {
    com.dexecutor.executor.TaskProvider.Task task = taskProvider.provid(this.node.getValue());
    task.execute();
    return this.node;
}