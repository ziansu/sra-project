public final void stop() {
    if ((status) == (TerminalStatusType.RUNNING)) {
        status = TerminalStatusType.STOPPED;
    }
}