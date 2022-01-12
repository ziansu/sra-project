@org.junit.Test
public void getSubTaskTest() {
    java.util.ArrayList<net.sf.memoranda.Task> container;
    container = new java.util.ArrayList<net.sf.memoranda.Task>();
    net.sf.memoranda.Task child;
    child = new net.sf.memoranda.TaskImpl(task);
    child.setID("child");
    container.add(child);
    task.setSubTasks(container);
    assertEquals(task.getSubTask("child"), child);
}