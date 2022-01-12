@java.lang.Override
public void chanceBlock(int x, int z, org.bukkit.block.Block block) {
    if (((block.getBiome()) == (org.bukkit.block.Biome.MUSHROOM_ISLAND)) || ((block.getBiome()) == (org.bukkit.block.Biome.MUSHROOM_SHORE))) {
        if ((block.getType()) == (org.bukkit.Material.GRASS)) {
            block.setType(Material.MYCEL);
        }
    }
}