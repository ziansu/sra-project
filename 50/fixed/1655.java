@org.junit.Test
public void setFrozenTest() {
    task.setFrozen(true);
    assertEquals(Task.FROZEN, task.getStatus(new net.sf.memoranda.date.CalendarDate(3, 5, 2016)));
}