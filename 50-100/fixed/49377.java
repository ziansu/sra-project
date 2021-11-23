protected void handleSubmitButtonAction() throws de.qabel.desktop.repository.exception.EntityNotFoundExcepion, de.qabel.desktop.repository.exception.PersistenceException, de.qabel.desktop.ui.actionlog.QblDropInvalidMessageSizeException, de.qabel.desktop.ui.actionlog.QblDropPayloadSizeException, de.qabel.desktop.ui.actionlog.QblNetworkInvalidResponseException, de.qabel.desktop.ui.actionlog.QblSpoofedSenderException, de.qabel.desktop.ui.actionlog.QblVersionMismatchException {
    if ((textarea.getText().equals("")) || ((c) == null)) {
        return ;
    }
    sendDropMessage(c, textarea.getText());
    textarea.setText("");
}