@org.junit.Test
public void removeAllSubTasksTest() {
    java.util.ArrayList<net.sf.memoranda.Task> container;
    container = new java.util.ArrayList<net.sf.memoranda.Task>();
    net.sf.memoranda.Task child0;
    child0 = new net.sf.memoranda.TaskImpl(task);
    container.add(child0);
    net.sf.memoranda.Task child1;
    child1 = new net.sf.memoranda.TaskImpl(task);
    container.add(child1);
    task.setSubTasks(container);
    task.removeAllSubTasks();
    assertEquals(task.getSubTasks().size(), 0);
}