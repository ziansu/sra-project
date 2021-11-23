@java.lang.Override
public boolean isReduceComplete() {
    reduceComplete = isTaskComplete(reduceComplete, reducerTasks);
    return reduceComplete;
}