public org.eclipse.debug.core.model.IThread getThread() {
    if ((thread) == null) {
        thread = ((org.eclipse.debug.core.model.IThread) (factory.adapt(fr.obeo.dsl.debug.ThreadUtils.getThread(getHost()), org.eclipse.debug.core.model.IThread.class)));
        if ((thread) == null) {
            throw new java.lang.IllegalStateException("can't addapt Thread to IThread.");
        }
    }
    return thread;
}