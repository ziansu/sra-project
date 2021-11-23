private boolean intervalValid(com.google.gwt.user.client.ui.TextBox inputFrom, com.google.gwt.user.client.ui.TextBox inputTo) {
    try {
        if ((!(inputFrom.getValue().isEmpty())) && (!(inputTo.getValue().isEmpty()))) {
            return true;
        }
        if ((!(inputFrom.getValue().isEmpty())) || (!(inputTo.getValue().isEmpty()))) {
            return true;
        }
    } catch (java.lang.Exception e) {
    }
    return false;
}