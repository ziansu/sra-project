public void markTaskAsCompleated(TodoList toDoList) {
    java.lang.String choice;
    TodoItem task;
    try {
        view.printAllTasks(toDoList);
        choice = view.takeNumberToMark();
        int choiceInt = java.lang.Integer.parseInt(choice);
        task = toDoList.tasks.get((choiceInt - 1));
        task.markAsCompleated();
        view.printThatCompleated(task);
    } catch (java.lang.IndexOutOfBoundsException e) {
        java.lang.System.out.println("No task with such number !");
    }
}