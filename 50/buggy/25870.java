private void addRecurringTodo(com.equinox.Memory memory, int currentID, com.equinox.Todo newTodo) {
    recurringTodos.put(currentID, newTodo);
    memory.add(newTodo);
}