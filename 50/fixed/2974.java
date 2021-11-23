public void addTodo(java.lang.String name, java.lang.String desc, java.util.Date targetDate, boolean isDone) {
    ems.service.TodoService.todos.add(new ems.model.Todo((++(ems.service.TodoService.todoCount)), name, desc, targetDate, isDone));
}