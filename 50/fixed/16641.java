private boolean endsWithNewline(java.lang.String message) {
    if ((message.length()) < 1) {
        return false;
    }
    return (message.charAt(((message.length()) - 1))) == '\n';
}