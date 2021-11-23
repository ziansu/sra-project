private void echo() {
    if ((message.getContents().length) > 1) {
        if (verbose)
            logging.Logger.logMessage('I', this, "Executing echo command");
        
        notifier.send(((answerCommand) + (message.getContents()[1])));
    }else {
        java.lang.String error = "usage: echo <message>; see help for more information.";
        logging.Logger.logMessage('E', this, ("not enough arguments for echo command. " + error));
        notifier.send(((answerCommand) + error));
    }
}