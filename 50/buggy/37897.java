@org.junit.Test
public void testToJson() {
    java.lang.System.out.println("toJson");
    Classes.Word instance = new Classes.Word();
    javax.json.JsonObject expResult = null;
    javax.json.JsonObject result = instance.toJson();
    assertEquals(expResult, result);
    fail("The test case is a prototype.");
}