public long calculateTotalEffortFromSubTasks(net.sf.memoranda.Task t) {
    return t.recursivelyModifyEffortFromSubTasks();
}