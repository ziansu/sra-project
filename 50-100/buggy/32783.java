public void consoleWriteInput(final java.lang.String input, java.lang.String console) {
    if (!(org.rstudio.core.client.StringUtil.isNullOrEmpty(console)))
        prompt_.setHTML("");
    
    clearPendingInput();
    output(input, ((styles_.command()) + (org.rstudio.studio.client.common.shell.ShellWidget.KEYWORD_CLASS_NAME)), false);
}