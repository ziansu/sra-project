@org.junit.Test
public void testDeleteRange() {
    java.lang.String userCommand = "delete 1 - 3";
    java.util.ArrayList<java.lang.Integer> expectedResult = new java.util.ArrayList<>();
    expectedResult.add(1);
    expectedResult.add(2);
    expectedResult.add(3);
    assertEquals(tasknote.parser.Parser.parseDelete(userCommand, true), expectedResult);
}