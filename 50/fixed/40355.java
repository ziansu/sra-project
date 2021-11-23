@java.lang.Override
public void apply(java.lang.Void arg) throws org.eclipse.che.api.promises.client.OperationException {
    org.eclipse.che.ide.api.debug.Breakpoint breakpoint = new org.eclipse.che.ide.api.debug.Breakpoint(Breakpoint.Type.BREAKPOINT, lineNumber, filePath, file, true);
    for (org.eclipse.che.ide.debug.DebuggerObserver observer : observers) {
        observer.onBreakpointAdded(breakpoint);
    }
}