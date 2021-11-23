@java.lang.Override
public long transferTo(com.sun.nio.sctp.SctpChannel ch) throws java.io.IOException {
    final com.sun.nio.sctp.MessageInfo messageInfo = com.sun.nio.sctp.MessageInfo.createOutgoing(ch.association(), null, streamNo);
    messageInfo.payloadProtocolID(protocolId);
    messageInfo.streamNumber(streamNo);
    return ch.send(buffer, messageInfo);
}