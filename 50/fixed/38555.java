public void inboundMessage(TeamOrange.instantmessenger.models.AppMucMessage message) {
    messages.add(message);
    if ((messageEvent) != null) {
        messageEvent.getMUC(this);
    }
}