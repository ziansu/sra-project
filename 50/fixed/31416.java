@org.spine3.server.aggregate.Apply
private void event(org.spine3.examples.todolist.TaskDetails event) {
    getBuilder().setPriority(event.getPriority()).setDescription(event.getDescription()).setCompleted(event.getCompleted());
}