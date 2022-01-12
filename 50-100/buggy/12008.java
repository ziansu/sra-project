@org.junit.Test
public void getSubTasksTest() {
    java.util.ArrayList<net.sf.memoranda.Task> param;
    param = new java.util.ArrayList<net.sf.memoranda.Task>();
    param.add(new net.sf.memoranda.TaskImpl(task));
    param.add(new net.sf.memoranda.TaskImpl(task));
    task.setSubTasks(param);
    assertEquals(task.getSubTasks(), param);
}