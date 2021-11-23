protected void handleDebugTargetTerminated(org.eclipse.debug.core.DebugEvent debugEvent) {
    java.lang.Object source = debugEvent.getSource();
    if (source instanceof org.eclipse.debug.core.model.IDebugTarget) {
        org.eclipse.debug.core.model.IDebugTarget target = ((org.eclipse.debug.core.model.IDebugTarget) (source));
        if (target == (activeDebugTarget)) {
            activeSourceDisplay.terminate();
        }
    }
}