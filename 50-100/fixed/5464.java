@java.lang.Override
protected boolean removeBreakpoint(java.lang.String uri, int lineNo) {
    lineNo -= 1;
    java.util.Map<java.lang.Integer, org.chromium.sdk.Breakpoint> scriptBreakpoints = breakpoints.get(uri);
    if (scriptBreakpoints != null) {
        org.chromium.sdk.Breakpoint bp = scriptBreakpoints.remove(java.lang.Integer.valueOf(lineNo));
        if (bp != null) {
            org.chromium.sdk.CallbackSemaphore semaphore = new org.chromium.sdk.CallbackSemaphore();
            semaphore.acquireDefault(bp.clear(callback, semaphore));
            breakpointProps.remove(bp);
            return true;
        }
    }
    return false;
}