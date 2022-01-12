@org.junit.Test
public void testFindAllToDoItems() {
    com.manning.gia.todo.model.ToDoItem toDoItem1 = new com.manning.gia.todo.model.ToDoItem();
    toDoItem1.setName("Write unit tests");
    com.manning.gia.todo.model.ToDoItem toDoItem2 = new com.manning.gia.todo.model.ToDoItem();
    toDoItem2.setName("Write integration tests");
    com.manning.gia.todo.model.ToDoItem toDoItem3 = new com.manning.gia.todo.model.ToDoItem();
    toDoItem3.setName("Write functional tests");
    inMemoryToDoRepository.insert(toDoItem1);
    inMemoryToDoRepository.insert(toDoItem2);
    inMemoryToDoRepository.insert(toDoItem3);
    java.util.List<com.manning.gia.todo.model.ToDoItem> toDoItems = inMemoryToDoRepository.findAll();
    org.junit.Assert.assertEquals(3, 0);
}