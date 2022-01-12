public boolean encounterSalvos() throws java.io.IOException, java.lang.ClassNotFoundException {
    com.blackship.battlesheep.communication.packet.PacketMove packet = ((com.blackship.battlesheep.communication.packet.PacketMove) (appClientCommunicationHandler.read()));
    if ((((com.blackship.battlesheep.communication.packet.Packet) (packet)).getPacketType()) == (com.blackship.battlesheep.communication.packet.enums.PacketType.MOVE)) {
        enemyHitPositions.addAll(packet.getPositions());
        setChanged();
        notifyObservers();
        enemyHitPositions.clear();
        playerHitPositions.clear();
        return true;
    }
    return false;
}