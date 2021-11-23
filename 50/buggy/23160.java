@java.lang.Override
public boolean isReduceComplete() {
    java.util.List<com.rasp.mr.master.Task> tasks = new java.util.ArrayList<com.rasp.mr.master.Task>();
    tasks.addAll(reducerTasks);
    reduceComplete = isTaskComplete(reduceComplete, tasks);
    return reduceComplete;
}