private void indicateTaskManagerChanged(java.lang.String message) {
    seedu.address.model.ModelManager.logger.fine(message);
    raise(new seedu.address.commons.events.model.TaskManagerChangedEvent(taskManager));
}