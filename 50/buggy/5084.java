@java.lang.Override
public void listen(org.perfectable.eventable.Sink<? super org.perfectable.webchat.ChatMessage> sink) {
    sink.receiveAll(messages.values());
    this.messageChannel.listen(sink);
}