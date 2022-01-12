protected void completeTransition() throws java.lang.Exception, rcms.fm.fw.user.UserActionException {
    rcms.statemachine.definition.State FMState = fm.getState();
    fm.setAction("Transition Completed");
    setTimeoutThread(false);
    rcms.fm.app.level1.HCALStateNotificationHandler.logger.info(("completeTransition: fire taskSequence completion event " + (taskSequence.getCompletionEvent().toString())));
    fm.fireEvent(taskSequence.getCompletionEvent());
    activeTask = null;
    taskSequence = null;
}