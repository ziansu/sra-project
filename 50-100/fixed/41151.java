public void run(java.lang.Object[] args) {
    Client.ServerHandler client = ((Client.ServerHandler) (args[0]));
    java.lang.String data = ((Global.Packet.PacketData) (args[1])).Data();
    client.Info.put("RET_STAT", data);
}