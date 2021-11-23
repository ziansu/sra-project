public void addNewTask(TodoList toDoList) {
    java.lang.String content = view.takeTaskContent();
    TodoItem newTask = new TodoItem(content);
    toDoList.add(newTask);
}