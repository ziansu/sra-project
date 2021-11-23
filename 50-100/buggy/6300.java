private void help() {
    try {
        java.lang.StringBuilder info = util.FileHandler.readStringBuilder("information");
        info.append(util.FileHandler.readStringBuilder("commandHelp"));
        notifier.send(((answerCommand) + (info.toString())));
    } catch (java.lang.Exception ex) {
        java.lang.String error = "Error when reading help file.";
        logging.Logger.logMessage('E', this, error);
        notifier.send(((answerCommand) + error));
    }
}