@org.junit.Test
public void testAddBadTaskWithDateWithoutTime() {
    java.lang.String userCommand = "add badtask on 2/3/2002";
    tasknote.shared.TaskObject expectedResult = new tasknote.shared.TaskObject("badtask");
    java.util.GregorianCalendar today = new java.util.GregorianCalendar();
    expectedResult.setDateYear(2002);
    expectedResult.setDateMonth(3);
    expectedResult.setDateDay(2);
    assertEquals(tasknote.parser.Parser.parseAdd(userCommand), expectedResult);
}