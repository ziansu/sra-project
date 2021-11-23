public final void resumeProcess() {
    synchronized(this) {
        processState = nw.commons.enums.ProcessState.ACTIVE;
        logger.info(("Process has been resumed: pid " + (processId)));
        notify();
    }
}