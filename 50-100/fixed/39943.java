public void run() {
    if (parsingNeeded) {
        parseMessage();
    }
    if (parsedWell) {
        handleMessage(message.getContents());
    }else {
        logging.Logger.logMessage('W', this, (("Message " + (java.lang.String.valueOf(id))) + " was not parsed well. Exiting."));
    }
}