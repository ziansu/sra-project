@com.google.common.eventbus.Subscribe
private void handlePersonPanelSelectionChangedEvent(seedu.jobs.commons.events.ui.TaskPanelSelectionChangedEvent event) {
    seedu.jobs.ui.UiManager.logger.info(seedu.jobs.commons.core.LogsCenter.getEventHandlingLogMessage(event));
}