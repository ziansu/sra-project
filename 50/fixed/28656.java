private void setupLogAppender() {
    onScreenConsoleOutputDelegate = new OnScreenConsoleOutputDelegate(outputTextArea);
    org.apache.log4j.Logger.getRootLogger().addAppender(onScreenConsoleOutputDelegate);
}