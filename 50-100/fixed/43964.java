@java.lang.Override
public void run() {
    while (true) {
        try {
            org.insa.chatsystem.ni.UDPReceiver.socket.receive(this.packet);
            java.lang.String data = new java.lang.String(packet.getData(), 0, packet.getLength());
            org.insa.chatsystem.ni.JSONObject dataJSON = new org.insa.chatsystem.ni.JSONObject(data);
            java.lang.System.out.println(("Reçu : " + dataJSON));
            this.udpReceiverToChatNI.rcvdMessage(packet.getAddress(), org.insa.chatsystem.messages.Message.fromJSON(dataJSON));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            break;
        }
    } 
}