private void addStepWatch(com.sun.jdi.request.EventRequestManager erm, com.sun.jdi.event.Event event) {
    stepRequest = erm.createStepRequest(((com.sun.jdi.event.VMStartEvent) (event)).thread(), StepRequest.STEP_LINE, StepRequest.STEP_INTO);
    stepRequest.setSuspendPolicy(EventRequest.SUSPEND_EVENT_THREAD);
    for (java.lang.String ex : stepWatchExcludes) {
        stepRequest.addClassExclusionFilter(ex);
    }
    stepRequest.enable();
}