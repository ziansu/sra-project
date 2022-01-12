public net.sf.json.JSON getMessageJSON() {
    if ((messageJSON) != null)
        return messageJSON;
    
    java.lang.String message = getMessage();
    if (message != null)
        return net.sf.json.JSONSerializer.toJSON(message.trim());
    
    return null;
}