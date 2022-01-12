public void breakBlock(org.bukkit.block.Block b) {
    broken.add(new com.redthirddivision.spleef.utils.BlockContainer(b));
    b.setType(Material.AIR);
    b.breakNaturally();
}