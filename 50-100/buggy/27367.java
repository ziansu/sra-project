@java.lang.Override
public void changeBlock(org.bukkit.entity.Player player, org.bukkit.Location location, org.bukkit.Material type, byte data) {
    com.comphenix.packetwrapper.WrapperPlayServerBlockChange packet = new com.comphenix.packetwrapper.WrapperPlayServerBlockChange();
    packet.setLocation(new com.comphenix.protocol.wrappers.BlockPosition(location.getBlockX(), location.getBlockY(), location.getBlockZ()));
    if ((location.getBlock().getType()) == (org.bukkit.Material.ENDER_CHEST)) {
        type = org.bukkit.Material.REDSTONE_TORCH_ON;
    }
    packet.setBlockData(com.comphenix.protocol.wrappers.WrappedBlockData.createData(type, data));
    packet.sendPacket(player);
}