@com.google.common.eventbus.Subscribe
private void handleJumpToListRequestEvent(seedu.jobs.commons.events.ui.JumpToListRequestEvent je) {
    targetedJumpIndex = je.targetIndex;
}