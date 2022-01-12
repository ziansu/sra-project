public void run(java.lang.Object[] args) {
    Client.ServerHandler client = ((Client.ServerHandler) (args[0]));
    client.Data = ((java.lang.String) (((Global.Packet.PacketData) (args[1])).Data()));
    client.NewData = true;
    notifyAll();
}