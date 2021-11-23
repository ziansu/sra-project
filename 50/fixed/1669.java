@com.google.common.eventbus.Subscribe
public void handleJumpToListRequestEvent(seedu.jobs.commons.events.ui.JumpToListRequestEvent je) {
    targetedJumpIndex = je.targetIndex;
}