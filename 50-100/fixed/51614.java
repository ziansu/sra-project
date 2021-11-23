public void test_AM_PM() {
    com.todoroo.astrid.service.TaskService taskService = new com.todoroo.astrid.service.TaskService();
    com.todoroo.astrid.data.Task task = new com.todoroo.astrid.data.Task();
    java.lang.String testTitle = "Jog at 8:33 PM.";
    insertTitleAddTask(testTitle, task, taskService);
    java.util.Date date = new java.util.Date(task.getValue(Task.DUE_DATE));
    assertEquals(date.getMinutes(), 33);
    assertEquals(date.getHours(), 20);
}