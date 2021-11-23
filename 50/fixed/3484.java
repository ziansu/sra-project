public java.util.List<com.done.model.Done> getTasks() {
    logic = new com.done.logic.Logic();
    return this.logic.getTasksForUI();
}