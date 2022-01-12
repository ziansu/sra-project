public void addMessage(java.lang.String message) {
    if ((messages.remainingCapacity()) == 0) {
        try {
            user.getSession().close(new javax.websocket.CloseReason(CloseReason.CloseCodes.UNEXPECTED_CONDITION, "Too many stored messages"));
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    try {
        this.messages.put(message);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
        this.interrupt();
    }
}