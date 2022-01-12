@org.junit.Test
public void addSubTaskTest() {
    java.util.ArrayList<net.sf.memoranda.Task> container;
    container = new java.util.ArrayList<net.sf.memoranda.Task>();
    task.setSubTasks(container);
    net.sf.memoranda.Task child;
    child = new net.sf.memoranda.TaskImpl(task);
    child.setID("child");
    task.addSubTask(child);
    assertEquals(task.getSubTask("child"), child);
}