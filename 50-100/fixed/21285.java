private void handleIntervalMessage(IntervalMessage message) {
    if (this.sentPositionRequests.containsKey(message.requestUuid)) {
        DataMessage dataMessage = this.sentPositionRequests.get(message.requestUuid);
        dataMessage.position = message.start;
        println("YO HABEN POSITION ERHALTEN DIGGAH");
        this.sentPositionRequests.remove(message.requestUuid);
        this.handleDataMessage(dataMessage);
    }else {
        this.split(message);
    }
}