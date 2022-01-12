public void printSubscriberOnNext(java.lang.String subscriberName, java.lang.Object value, java.lang.String threadName) {
    final java.lang.String message = messageBuilder.buildSubscriberOnNextMessage(subscriberName, value, threadName);
    this.printMessage(subscriberName, message);
}