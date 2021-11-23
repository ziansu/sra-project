private void populateArrayItems() {
    todoItems = com.orm.query.Select.from(com.example.aotarolaalvarad.todoapp.TodoItem.class).where(com.orm.query.Condition.prop("is_done").eq("false")).list();
    aToDoAdapter = new com.example.aotarolaalvarad.todoapp.TodoItemAdapter(this, todoItems);
}