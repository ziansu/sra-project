public java.lang.String getAdditional(com.mak001.api.plugins.Command command, java.lang.String message) {
    for (java.lang.String string : command.getCommand()) {
        if (message.endsWith(" "))
            message = message.trim();
        
        if (message.equalsIgnoreCase(string))
            return "";
        
        message.replaceFirst(("(?i)" + string), "");
    }
    return message;
}