public void testRetrieveAllTodo() {
    java.util.ArrayList<object.Todo> expectedList = new java.util.ArrayList<object.Todo>();
    expectedList.add(todo7);
    expectedList.add(todo5);
    expectedList.add(todo3);
    expectedList.add(todo6);
    expectedList.add(todo4);
    expectedList.add(todo2);
    expectedList.add(todo1);
    java.util.ArrayList<object.Todo> actualList = storagetest.FileTodoHandlerTest.fTodoH.retrieveAllTodo();
}