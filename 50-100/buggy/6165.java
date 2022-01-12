private boolean executeAllTasks() {
    boolean result = true;
    for (matrixstudio.model.Task task : orderedTasks) {
        result &= enqueueTask(task);
    }
    try {
        int error = org.jocl.CL.clWaitForEvents(allEvents.length, allEvents);
        if (error != 0) {
            log.error((("Error waiting for tasks to complete: " + error) + "."));
            return false;
        }
    } catch (org.jocl.CLException e) {
        log.error(org.xid.basics.error.DiagnosticUtil.createMessage(e));
        return false;
    }
    return result;
}