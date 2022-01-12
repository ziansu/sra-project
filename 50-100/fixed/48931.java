private static boolean isNodeNameValid(final java.lang.String nodeName) {
    boolean retval = false;
    if (nodeName == null) {
        return retval;
    }
    if ((nodeName.length()) == 0) {
        return retval;
    }
    if ((nodeName.charAt(0)) == ' ') {
        return retval;
    }
    if ((nodeName.length()) > 0) {
        retval = true;
    }
    return retval;
}