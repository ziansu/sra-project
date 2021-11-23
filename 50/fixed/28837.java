@org.junit.Test
public void testGetWordId() {
    java.lang.System.out.println("getWordId");
    Classes.Word instance = new Classes.Word();
    int expResult = 0;
    int result = instance.getWordId();
    assertEquals(expResult, result);
}