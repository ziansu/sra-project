public static boolean add(tds.Task task) {
    boolean isAdded = true;
    for (java.util.TreeSet<tds.Task> tree : tds.TaskTree.taskTrees) {
        if (!(tree.add(task))) {
            isAdded = false;
        }
    }
    if (isAdded) {
        tds.TaskTree.increaseTaskListSize();
        tds.TaskTree.pushAddToStorage(task);
    }
    return isAdded;
}