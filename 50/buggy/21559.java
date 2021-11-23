public void registerKryoClasses(com.esotericsoftware.kryo.Kryo kryo) {
    kryo.register(com.ives.relative.core.packets.Packet.class);
    kryo.register(com.ives.relative.planet.tiles.tilesorts.SolidTile.class);
    kryo.register(com.ives.relative.core.packets.PlayerPacket.class);
    kryo.register(com.ives.relative.core.packets.TilePacket.class);
}