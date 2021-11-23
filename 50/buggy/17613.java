@java.lang.Override
public void processPacket(org.jivesoftware.smack.packet.Stanza arg0) throws org.jivesoftware.smack.SmackException.NotConnectedException {
    java.lang.String from = arg0.getFrom();
    java.lang.System.out.println(from);
}