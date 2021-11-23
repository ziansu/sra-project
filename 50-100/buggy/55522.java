public static org.bukkit.block.Block getSourceBlock(org.bukkit.entity.Player player, double range, com.projectkorra.projectkorra.util.BlockSource.BlockSourceType sourceType, com.projectkorra.projectkorra.util.ClickType clickType) {
    com.projectkorra.projectkorra.util.BlockSourceInformation info = com.projectkorra.projectkorra.util.BlockSource.getValidBlockSourceInformation(player, range, sourceType, clickType);
    if (info != null) {
        if (com.projectkorra.projectkorra.util.TempBlock.isTempBlock(info.getBlock())) {
            return null;
        }
        return info.getBlock();
    }
    return null;
}