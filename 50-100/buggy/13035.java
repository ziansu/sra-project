private void info() {
    try {
        java.lang.StringBuilder info = util.FileHandler.readStringBuilder("information");
        notifier.send(((answerCommand) + (info.toString())));
    } catch (java.lang.Exception ex) {
        java.lang.String error = "Error when reading info file.";
        logging.Logger.logMessage('E', this, error);
        notifier.send(((answerCommand) + error));
    }
}