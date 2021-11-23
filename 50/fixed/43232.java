private int getMessageValue(java.lang.String message) {
    java.lang.String value = message.substring(((message.indexOf(":")) + 1));
    value = value.trim();
    return java.lang.Integer.parseInt(value);
}