@org.junit.Test
public void testAddBasicDeadlineBadHourBadMinute() {
    java.lang.String userCommand = "add baddeadlinehourminute by 76:90";
    tasknote.shared.TaskObject expectedResult = new tasknote.shared.TaskObject("baddeadlinehourminute");
    assertEquals(tasknote.parser.Parser.parseAdd(userCommand, true), expectedResult);
}