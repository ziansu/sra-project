public void breakpointRemoved(org.eclipse.debug.core.model.IBreakpoint breakpoint, org.eclipse.core.resources.IMarkerDelta delta) {
    if (breakpoint instanceof org.python.pydev.debug.model.PyBreakpoint) {
        org.python.pydev.debug.model.PyBreakpoint b = ((org.python.pydev.debug.model.PyBreakpoint) (breakpoint));
        org.python.pydev.debug.model.remote.RemoveBreakpointCommand cmd = new org.python.pydev.debug.model.remote.RemoveBreakpointCommand(this, b.breakpointId, b.getFile(), b.getType());
        this.postCommand(cmd);
    }
}