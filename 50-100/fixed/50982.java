private void verifyMutedIconSettingInUpdateBreakpointPresentation(java.lang.Boolean muted) {
    com.intellij.xdebugger.breakpoints.XBreakpointManager breakpointManager = org.mockito.Mockito.mock(com.intellij.xdebugger.breakpoints.XBreakpointManager.class);
    com.intellij.xdebugger.XDebugSession debugSession = org.mockito.Mockito.mock(com.intellij.xdebugger.XDebugSession.class);
    org.mockito.Mockito.when(debugSession.areBreakpointsMuted()).thenReturn(muted);
    com.google.cloud.tools.intellij.debugger.CloudDebugProcess cloudDebugProcess = mockCloudDebugProcess(breakpointManager, debugSession);
    com.google.cloud.tools.intellij.debugger.CloudLineBreakpointType.CloudLineBreakpoint breakpoint = mockCloudLineBreakpoint("mock error message", org.mockito.Mockito.mock(com.intellij.xdebugger.impl.breakpoints.XLineBreakpointImpl.class));
    cloudDebugProcess.updateBreakpointPresentation(breakpoint);
    org.mockito.Mockito.verify(breakpoint).getSetIcon(muted);
}