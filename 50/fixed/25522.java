@com.google.common.eventbus.Subscribe
public void handleShowHelpRequestEvent(seedu.jobs.commons.events.ui.ShowHelpRequestEvent she) {
    helpShown = true;
}