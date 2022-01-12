private void processEventQueue() {
    if (mEventQueueInProgress) {
    }else {
        mEventQueueInProgress = true;
        while ((mEventQueue.peek()) != null) {
            de.artcom.hsm.Event event = mEventQueue.poll();
            if (!(mCurrentState.handleWithOverride(event))) {
                de.artcom.hsm.StateMachine.LOGGER.debug(("nobody handled event: " + (event.getName())));
            }
        } 
        mEventQueueInProgress = false;
    }
}