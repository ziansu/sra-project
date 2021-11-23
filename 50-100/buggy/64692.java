@org.bukkit.event.EventHandler
public void preventWrongIce(org.bukkit.event.block.BlockFormEvent e) {
    org.bukkit.block.Block b = event.getToBlock();
    if ((b.getType()) != (org.bukkit.Material.ICE)) {
        return ;
    }
    org.bukkit.block.BlockFace[] faces = new org.bukkit.block.BlockFace[]{ org.bukkit.block.BlockFace.NORTH , org.bukkit.block.BlockFace.SOUTH , org.bukkit.block.BlockFace.EAST , org.bukkit.block.BlockFace.WEST };
    for (org.bukkit.block.BlockFace face : faces) {
        if (b.getRelative(face).getType().isSolid()) {
            return ;
        }
    }
    e.setCancelled(true);
}