@org.junit.Test
public void getSubTasksTest() {
    java.util.ArrayList<net.sf.memoranda.Task> param;
    param = new java.util.ArrayList<net.sf.memoranda.Task>();
    param.add(new net.sf.memoranda.TaskImpl(new java.util.ArrayList<net.sf.memoranda.Task>()));
    param.add(new net.sf.memoranda.TaskImpl(new java.util.ArrayList<net.sf.memoranda.Task>()));
    task.setSubTasks(param);
    assertEquals(param, task.getSubTasks());
}