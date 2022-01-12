public void init() {
    mTaskPool = new com.mumu.joshautomation.fsm.FSM.TaskPollThread();
    mTransitionCheckingThread = new com.mumu.joshautomation.fsm.FSM.TransitionCheckThread();
}