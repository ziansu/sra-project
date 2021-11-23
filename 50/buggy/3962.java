protected final void breakpointHit(final org.eclipse.debug.core.model.IBreakpoint breakpoint) {
    this.thread.setBreakpoint(breakpoint);
}