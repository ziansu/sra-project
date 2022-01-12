public static java.lang.String DecodeMessage(java.lang.String encodedMessage) {
    return (encodedMessage.charAt(0)) == 'm' ? encodedMessage.substring(1, encodedMessage.length()) : null;
}