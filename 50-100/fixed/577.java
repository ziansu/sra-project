public void updateValues(final com.monits.agilefant.model.Story task) {
    this.name = task.getName();
    this.rank = task.getRank();
    this.backlog = task.getBacklog();
    this.iteration = task.getIteration();
    this.tasks = task.getTasks();
    this.metrics = task.getMetrics();
    this.state = task.getState();
    this.responsibles = task.getResponsibles();
}