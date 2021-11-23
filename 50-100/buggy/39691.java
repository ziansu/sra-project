private void parseMessage() {
    if (verbose)
        logging.Logger.logMessage('I', this, "Parsing message...");
    
    org.json.JSONObject obj = new org.json.JSONObject(messageString);
    if (obj.getString("event").equals("message")) {
        message = new misc.Message(obj);
    }else {
        logging.Logger.logMessage('E', this, ("Given JSONString is not a message. JSONString:\n" + (messageString)));
    }
    if (verbose)
        logging.Logger.logMessage('I', this, ("Resulting messageText: " + (messageText)));
    
}