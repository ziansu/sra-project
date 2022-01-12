void addAmountTodo(int amt, todolist.TodoList list) {
    todolist.Todo head = new todolist.Todo("Task 1");
    list.addTodo(head);
    int numAdded = 1;
    while (numAdded != amt) {
        numAdded++;
        todolist.Todo newTodo = new todolist.Todo(("Task " + (java.lang.Integer.toString(numAdded))));
        list.addTodo(newTodo);
    } 
}