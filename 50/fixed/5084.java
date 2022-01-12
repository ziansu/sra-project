@java.lang.Override
public void listen(org.perfectable.eventable.Sink<? super org.perfectable.webchat.ChatMessage> sink) {
    sink.receiveAll(messages);
    this.messageChannel.listen(sink);
}