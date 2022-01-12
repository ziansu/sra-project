@java.lang.Override
public void processServer(engine.network.server.Server server, engine.network.server.ServerClient client) {
    if ((client.playerMob) == null)
        return ;
    
    byte travelDir = engine.network.packet.PacketRequestTravel.getTravelDir(client.playerMob);
    if (travelDir != (-1)) {
        engine.network.packet.PacketTravelForm packet = new engine.network.packet.PacketTravelForm(server, client, travelDir);
        server.network.sendPacket(packet, client);
    }
}