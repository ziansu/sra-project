@java.lang.Override
public com.digi.xbee.api.packet.XBeePacket answer(org.mockito.invocation.InvocationOnMock invocation) throws java.lang.Throwable {
    if (testCI.alreadyRead)
        return null;
    
    testCI.alreadyRead = true;
    return PACKET_TO_BE_RECEIVED;
}