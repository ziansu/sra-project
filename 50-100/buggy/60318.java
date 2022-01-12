@org.junit.Test
public void testAddNodeToEmptyList() {
    java.lang.System.out.println("addNodeToEmptyList");
    int index = 0;
    java.lang.String element = "Added Element";
    linkedlistdiscussion.LinkedList<java.lang.String> instance = new linkedlistdiscussion.LinkedList();
    boolean expResult = true;
    boolean result = instance.add(index, element);
    assertEquals(expResult, result);
}