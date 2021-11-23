@org.junit.Test
public void getTask() throws java.lang.Exception {
    jfdi.logic.events.AddTaskDoneEvent e = new jfdi.logic.events.AddTaskDoneEvent(task);
    assertSame(task, e.getTask());
}