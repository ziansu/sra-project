public static main.testutil.TestTask[] removeTasksFromList(final main.testutil.TestTask[] tasks, main.testutil.TestTask... tasksToRemove) {
    java.util.List<main.testutil.TestTask> listOfTasks = main.testutil.TestUtil.asList(tasks);
    listOfTasks.removeAll(main.testutil.TestUtil.asList(tasksToRemove));
    return listOfTasks.toArray(new main.testutil.TestTask[listOfTasks.size()]);
}