public void setConsoleText(java.lang.String text) {
    LabelConsole.setText("Console got message:");
    ch.idsia.tools.LOGGER.println(("\nConsole got message:\n" + text), LOGGER.VERBOSE_MODE.INFO);
}