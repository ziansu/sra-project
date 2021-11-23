public void testRetrieveTodoByDate() {
    java.util.ArrayList<object.Todo> expectedList = new java.util.ArrayList<object.Todo>();
    expectedList.add(todo3);
    expectedList.add(todo7);
    expectedList.add(todo5);
    java.util.ArrayList<object.Todo> actualList = storagetest.FileHandlerTest.fh.retrieveTodoByDate("20 oct 2000");
    org.junit.Assert.assertEquals("Test retrieval of todo by date", true, storagetest.PreparationCleanUp.compareTodoArrayList(expectedList, actualList));
}