public boolean isEmptyContext(java.lang.Object cursorPosition) {
    if (cursorPosition == null) {
        return true;
    }
    if (cursorPosition instanceof java.lang.Boolean) {
        return !(((java.lang.Boolean) (cursorPosition)).booleanValue());
    }
    if (cursorPosition instanceof java.util.Collection) {
        return (((java.util.Collection) (cursorPosition)).size()) == 0;
    }
    return false;
}