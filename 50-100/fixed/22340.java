public static boolean remove(tds.Task task) {
    boolean isRemoved = true;
    for (java.util.TreeSet<tds.Task> tree : tds.TaskTree.taskTrees) {
        if (!(tree.remove(task))) {
            isRemoved = false;
        }
    }
    if (isRemoved) {
        tds.TaskTree.decreaseTaskListSize();
        tds.TaskTree.pushRemoveToStorage(task);
    }
    return isRemoved;
}