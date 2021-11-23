private void split(IntervalMessage message) {
    java.util.Queue<PositionRequestMessage> queue = this.returnAddresses.get(message.requestUuid);
    if (queue == null) {
        return ;
    }
    int intervalStart = message.start;
    for (PositionRequestMessage prMessage : queue) {
        prMessage.sender.send(new IntervalMessage(this, prMessage.sender, intervalStart, ((intervalStart + (prMessage.i)) - 1), prMessage.uuid));
        intervalStart += prMessage.i;
    }
    this.returnAddresses.remove(message.requestUuid);
}