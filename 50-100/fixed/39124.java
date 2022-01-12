@org.junit.Test
public void dbShouldAddTask() throws java.lang.Exception {
    todo.javier.mera.todolist.model.TodoList todoList = createTodoList();
    todo.javier.mera.todolist.model.Task newTask = createTask(todoList.getId());
    mDataSource.createTodoList(todoList, 0);
    long rowId = mDataSource.createTask(newTask, 0);
    junit.framework.Assert.assertTrue((rowId > (-1)));
}