public static org.bukkit.block.Block getNearCauldron(io.github.davidg95.equestricraftplugin.MyHorse horse) {
    final org.bukkit.entity.Horse h = horse.getHorse();
    for (org.bukkit.block.Block b : io.github.davidg95.equestricraftplugin.MyHorse.getNearbyBlocks(h)) {
        if ((b.getType()) == (org.bukkit.Material.CAULDRON)) {
            return b;
        }
    }
    return null;
}