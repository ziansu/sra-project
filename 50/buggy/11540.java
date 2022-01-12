public void messages(@org.jetbrains.annotations.Nullable
java.util.Collection<org.apache.ignite.spi.discovery.tcp.messages.TcpDiscoveryAbstractMessage> msgs, @org.jetbrains.annotations.Nullable
org.apache.ignite.lang.IgniteUuid discardMsgId, @org.jetbrains.annotations.Nullable
java.util.Collection<org.apache.ignite.spi.discovery.tcp.messages.TcpDiscoveryAbstractMessage> customMsgs, @org.jetbrains.annotations.Nullable
org.apache.ignite.lang.IgniteUuid discardCustomMsgId) {
    this.msgs = msgs;
    this.discardMsgId = discardMsgId;
    this.customMsgs = customMsgs;
    this.discardCustomMsgId = discardCustomMsgId;
}