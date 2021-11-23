private static void sendMapPacket(int cx, int cz, net.minecraft.entity.player.EntityPlayerMP client, byte[] largeMap) throws java.io.IOException {
    byte[] compressed;
    if (cx == (micdoodle8.mods.galacticraft.core.util.MapUtil.LARGEMAP_MARKER)) {
        if ((micdoodle8.mods.galacticraft.core.util.MapUtil.overworldImageCompressed) == null) {
            micdoodle8.mods.galacticraft.core.util.MapUtil.overworldImageCompressed = micdoodle8.mods.galacticraft.core.util.MapUtil.zipCompress(largeMap);
        }
        compressed = micdoodle8.mods.galacticraft.core.util.MapUtil.overworldImageCompressed;
    }else {
        compressed = micdoodle8.mods.galacticraft.core.util.MapUtil.zipCompress(largeMap);
    }
    micdoodle8.mods.galacticraft.core.util.MapUtil.sendMapPacketCompressed(cx, cz, client, compressed);
}