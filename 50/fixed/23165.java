public void consoleWritePrompt(final java.lang.String prompt) {
    output(prompt, ((styles_.prompt()) + (org.rstudio.studio.client.common.shell.ShellWidget.KEYWORD_CLASS_NAME)), false, false);
    clearErrors_ = true;
}