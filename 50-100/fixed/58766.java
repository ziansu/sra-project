protected void handleInvalidValueException(com.vaadin.data.Validator.InvalidValueException m) {
    java.lang.String causeMessage = "";
    for (com.vaadin.data.Validator.InvalidValueException cause : m.getCauses()) {
        causeMessage += (cause.getMessage()) + ". ";
    }
    if (((m.getMessage()) != null) && ((m.getMessage().length()) > 0)) {
        causeMessage += (m.getMessage()) + ". ";
    }
    com.vaadin.ui.Notification.show(("Please fix the form errors and then try again.\n\n " + causeMessage), Type.ERROR_MESSAGE);
}