@com.google.common.eventbus.Subscribe
public void handleNewResultAvailableEvent(seedu.jobs.commons.events.ui.NewResultAvailableEvent event) {
    seedu.jobs.ui.ResultDisplay.logger.info(seedu.jobs.commons.core.LogsCenter.getEventHandlingLogMessage(event));
    displayed.setValue(event.message);
}