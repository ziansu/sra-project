protected void deleteLastCharIfCharIs(char ch) {
    if ((sb.charAt(((sb.length()) - 1))) == ch) {
        sb.deleteCharAt(((sb.length()) - 1));
    }
}