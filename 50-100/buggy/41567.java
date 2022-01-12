@org.junit.Test
public void testViewTaskNoDate() {
    try {
        serviceHandlertest.serviceHandlerTest.service.createItem(floatingTodo2);
        serviceHandlertest.serviceHandlerTest.service.createItem(floatingTodo1);
        java.util.ArrayList<object.Todo> expectedListTodo = new java.util.ArrayList<object.Todo>();
        expectedListTodo.add(floatingTodo2);
        expectedListTodo.add(floatingTodo1);
        assertEquals("View task by date", expectedListTodo, serviceHandlertest.serviceHandlerTest.service.viewTaskNoDate());
    } catch (java.lang.Exception e) {
        fail("exception should not be thrown");
    }
}