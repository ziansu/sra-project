public static main.testutil.TestTask[] removeTasksFromList(final main.testutil.TestTask[] tasks, main.testutil.TestTask... tasksToRemove) {
    java.util.List<main.testutil.TestTask> listOfTasks = main.testutil.TestUtil.asList(tasks, tasksToRemove, false);
    return listOfTasks.toArray(new main.testutil.TestTask[listOfTasks.size()]);
}