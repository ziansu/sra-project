protected java.lang.String generateCode(java.lang.String message) {
    message = message.toUpperCase();
    java.lang.StringBuilder codedMessage = new java.lang.StringBuilder("");
    for (int i = 0; i < (message.length()); i++) {
        java.lang.String val = morseCode.get(message.charAt(i));
        if (val != null) {
            codedMessage.append(val);
            codedMessage.append(" ");
        }else
            return null;
        
    }
    return codedMessage.toString();
}