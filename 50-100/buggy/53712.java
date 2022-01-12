@java.lang.Override
public void terminate() throws org.eclipse.debug.core.DebugException {
    sendEvent(new org.eclipse.debug.core.DebugEvent(this, org.eclipse.debug.core.DebugEvent.CHANGE));
    sendEvent(new org.eclipse.debug.core.DebugEvent(this, org.eclipse.debug.core.DebugEvent.TERMINATE));
    mLaunch.removeProcess(this);
    outputStreamMonitor.stop();
    errorStreamMonitor.stop();
    if (mProcess.isAlive()) {
        mProcess.destroy();
    }
}