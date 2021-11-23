private void exit(java.lang.String[] message) {
    logging.Logger.logMessage('I', this, "Received Exit-command over network. Exiting.");
    logging.LogManager.saveLogFile("log.txt");
    java.lang.System.exit(0);
}