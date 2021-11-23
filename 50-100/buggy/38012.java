@java.lang.Override
public void readFromServerData(protocolsupport.protocol.serializer.PacketDataSerializer serializer) {
    playerEntityId = serializer.readInt();
    gamemode = serializer.readByte();
    dimension = serializer.readByte();
    difficulty = serializer.readByte();
    serializer.readByte();
    maxplayers = protocolsupport.api.tab.TabAPI.getMaxTabSize();
    leveltype = serializer.readString(16);
    reducedDebugInfo = serializer.readBoolean();
}