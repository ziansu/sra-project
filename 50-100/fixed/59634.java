@org.junit.Test
public void dbShouldReadTodoList() throws java.lang.Exception {
    todo.javier.mera.todolist.model.TodoList expectedTodoList = createTodoList();
    mDataSource.createTodoList(expectedTodoList, 0);
    todo.javier.mera.todolist.model.TodoList actualTodoList = mDataSource.readTodoLists().get(0);
    junit.framework.Assert.assertNotNull(actualTodoList);
    junit.framework.Assert.assertEquals(expectedTodoList.getTitle(), actualTodoList.getTitle());
    junit.framework.Assert.assertEquals(expectedTodoList.getCreationDate(), actualTodoList.getCreationDate());
}