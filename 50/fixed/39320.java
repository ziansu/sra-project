public static java.lang.String getCommandKeyFromMessage(java.lang.String message) {
    return message.substring(1).split(" ")[0].toLowerCase();
}