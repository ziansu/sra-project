@org.junit.Test
public void getError() throws java.lang.Exception {
    jfdi.logic.events.AddTaskFailedEvent e = new jfdi.logic.events.AddTaskFailedEvent(AddTaskFailedEvent.Error.EMPTY_DESCRIPTION);
    assertEquals(AddTaskFailedEvent.Error.EMPTY_DESCRIPTION, e.getError());
}