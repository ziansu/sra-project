public static void addTreasureAndSync(int dimID, java.util.ArrayList<codechicken.lib.vec.BlockCoord> points) {
    java.util.ArrayList<codechicken.lib.vec.BlockCoord> activeSoFar = com.contained.game.Contained.getActiveTreasures(dimID);
    for (codechicken.lib.vec.BlockCoord p : points)
        activeSoFar.add(p);
    
    codechicken.lib.packet.PacketCustom treasurePacket = com.contained.game.network.ClientPacketHandlerUtil.packetAddTreasures(points);
    Contained.channel.sendToDimension(treasurePacket.toPacket(), dimID);
}