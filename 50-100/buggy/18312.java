public void testSaveAndLoadTaskList() {
    java.util.ArrayList<com.hazzard.nathan.to_do.Task> taskList = new java.util.ArrayList<com.hazzard.nathan.to_do.Task>();
    taskList.add(new com.hazzard.nathan.to_do.Task("Sample1", new java.util.GregorianCalendar(), 2, "", 0));
    taskList.add(new com.hazzard.nathan.to_do.Task("Sample2", new java.util.GregorianCalendar(), 2, "", 0));
    com.hazzard.nathan.to_do.TaskListManager.saveTaskList(main, taskList);
    assert taskList.equals(com.hazzard.nathan.to_do.TaskListManager.loadTaskList(main));
}