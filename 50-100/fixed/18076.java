private int parseCodeFromMessage(java.lang.String message) {
    if (message.contains(":")) {
        java.lang.String codeString = message.split(":")[1].trim();
        try {
            return java.lang.Integer.parseInt(codeString);
        } catch (java.lang.NumberFormatException nfe) {
            return 0;
        }
    }else {
        return 0;
    }
}