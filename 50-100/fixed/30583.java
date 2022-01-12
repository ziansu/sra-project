@org.junit.Test
public void testAddBasicDeadlineWithDate() {
    java.lang.String userCommand = "add longerdeadline on 1/2/2001 by 5:30";
    tasknote.shared.TaskObject expectedResult = new tasknote.shared.TaskObject("longerdeadline");
    java.util.GregorianCalendar today = new java.util.GregorianCalendar();
    expectedResult.setDateYear(2001);
    expectedResult.setDateMonth(2);
    expectedResult.setDateDay(1);
    expectedResult.setDateHour(5);
    expectedResult.setDateMinute(30);
    expectedResult.setTaskType("deadline");
    assertEquals(tasknote.parser.Parser.parseAdd(userCommand, true), expectedResult);
}