@com.google.common.eventbus.Subscribe
private void handleJumpToListRequestEvent(seedu.doit.commons.events.ui.JumpToListRequestEvent event) {
    seedu.doit.ui.UiManager.logger.info(seedu.doit.commons.core.LogsCenter.getEventHandlingLogMessage(event));
    this.mainWindow.getTaskListPanel().scrollTo(event.targetIndex);
}