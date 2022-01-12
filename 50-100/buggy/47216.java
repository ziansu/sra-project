private void onBreakpointActivated(org.eclipse.che.api.debug.shared.dto.LocationDto locationDto) {
    for (org.eclipse.che.ide.debug.DebuggerObserver observer : observers) {
        java.lang.String filePath = fqnToPath(locationDto);
        if (filePath != null) {
            observer.onBreakpointActivated(fqnToPath(locationDto), ((locationDto.getLineNumber()) - 1));
        }
    }
}