public static void showShulker(org.bukkit.block.Block blockToHighlight, int entityId, org.bukkit.entity.Player player) {
    net.minecraft.server.v1_11_R1.PacketPlayOutSpawnEntityLiving pposel = zedly.zenchantments.PlayerInteractUtil.generateShulkerSpawnPacket(blockToHighlight, entityId);
    net.minecraft.server.v1_11_R1.EntityPlayer ep = ((org.bukkit.craftbukkit.v1_11_R1.entity.CraftPlayer) (player)).getHandle();
    ep.playerConnection.networkManager.sendPacket(pposel);
}