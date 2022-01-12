@org.junit.Test
public void KPCommunication_replyToIncomingData_success() throws java.lang.Exception {
    net.sharkfw.asip.ASIPInterest space = net.sharkfw.knowledgeBase.inmemory.InMemoSharkKB.createInMemoASIPInterest(topics, types, peerA, peers, peers, null, null, ASIPSpace.DIRECTION_INOUT);
    java.lang.Thread.sleep(2000);
    java.lang.String rawInput = "Hello ASIP.";
    java.io.InputStream is = new java.io.ByteArrayInputStream(rawInput.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    net.sharkfw.asip.engine.ASIPOutMessage outMessage = engineA.createASIPOutMessage(peerB.getAddresses(), peerA, peerB, null, null, 10);
    outMessage.expose(space);
    java.lang.Thread.sleep(1000);
}