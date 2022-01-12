public boolean createNamedTerminal(java.lang.String caption) {
    if (org.rstudio.core.client.StringUtil.isNullOrEmpty(caption)) {
        createNewTerminal();
        return true;
    }
    if (!(isCaptionAvailable(caption))) {
        return false;
    }
    startTerminal(nextTerminalSequence(), null, caption, null, true, ConsoleProcessInfo.DEFAULT_COLS, ConsoleProcessInfo.DEFAULT_ROWS, TerminalShellInfo.SHELL_DEFAULT, false, null);
    return true;
}