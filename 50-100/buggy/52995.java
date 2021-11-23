@java.lang.Override
public eu.carrade.amaury.BelovedBlocks.blocks.WorldBlock getPlacedBlock(org.bukkit.block.BlockFace facing) {
    byte dataValue = 2;
    if (facing != null) {
        switch (facing) {
            case SOUTH :
                dataValue = 2;
                break;
            case NORTH :
                dataValue = 3;
                break;
            case WEST :
                dataValue = 4;
                break;
            case EAST :
                dataValue = 5;
                break;
        }
    }
    return new eu.carrade.amaury.BelovedBlocks.blocks.WorldBlock(org.bukkit.Material.BURNING_FURNACE, dataValue);
}