private boolean send(java.lang.String messageString) {
    getLog().onOutgoing(messageString);
    quickfix.Responder responder;
    synchronized(responderLock) {
        responder = this.responder;
    }
    if (responder == null) {
        getLog().onEvent(("No responder, not sending message: " + messageString));
        return false;
    }
    return responder.send(messageString);
}