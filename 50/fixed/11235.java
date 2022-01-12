@org.spine3.server.aggregate.Apply
private void event(org.spine3.examples.todolist.TaskDueDateUpdated event) {
    getBuilder().setId(event.getId()).setDueDate(event.getNewDueDate());
}