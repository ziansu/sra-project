@java.lang.Override
public void clearData() {
    handleStateChange(todoList);
    resetData(new seedu.todolist.model.TodoList());
}