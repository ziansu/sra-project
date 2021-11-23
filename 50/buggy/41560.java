@org.junit.Test
public void getEndDateTest() {
    net.sf.memoranda.date.CalendarDate param;
    param = new net.sf.memoranda.date.CalendarDate();
    task.setEndDate(param);
    assertEquals(task.getEndDate(), param);
}