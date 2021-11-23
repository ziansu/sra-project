@com.google.common.eventbus.Subscribe
private void handleShowHelpRequestEvent(seedu.jobs.commons.events.ui.ShowHelpRequestEvent she) {
    helpShown = true;
}