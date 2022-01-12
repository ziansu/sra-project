private java.lang.String getMessageType(java.lang.String msg) {
    for (int i = 0; i < (model.Messenger.VALID_RESPONSES.length); i++) {
        if ((msg.indexOf(model.Messenger.VALID_RESPONSES[i])) != (-1)) {
            return model.Messenger.VALID_RESPONSES[i];
        }
    }
    return null;
}