private boolean send(java.lang.String messageString) {
    quickfix.Responder responder = this.responder;
    if (null == responder) {
        this.getLog().onEvent(("No responder, not sending message: " + messageString));
        return false;
    }else {
        try {
            return responder.send(messageString);
        } finally {
            getLog().onOutgoing(messageString);
        }
    }
}