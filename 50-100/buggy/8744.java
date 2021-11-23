private void startTerminal(int sequence, java.lang.String terminalHandle, java.lang.String caption, java.lang.String title, boolean hasChildProcs, int cols, int rows, int shellType) {
    org.rstudio.studio.client.workbench.views.terminal.TerminalSession newSession = new org.rstudio.studio.client.workbench.views.terminal.TerminalSession(sequence, terminalHandle, caption, title, hasChildProcs, cols, rows, uiPrefs_.blinkingCursor().getValue(), shellType);
    newSession.connect();
    updateTerminalBusyStatus();
}