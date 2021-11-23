@org.junit.Test
public void getParentIDTest() {
    assertEquals(task.getParentID(), null);
    java.lang.String param;
    param = "";
    task.setID(param);
    net.sf.memoranda.Task child;
    child = new net.sf.memoranda.TaskImpl(new java.util.ArrayList<net.sf.memoranda.Task>());
    task.addSubTask(child);
    assertEquals("", child.getParentID());
}