@java.lang.Override
public net.minecraft.item.Item getItemDropped(net.minecraft.block.state.IBlockState state, java.util.Random random, int fortune) {
    net.minecraft.block.Block sapling = null;
    switch (state.getValue(net.tropicraft.core.common.block.BlockTropicraftLeaves.VARIANT)) {
        case PALM :
            return net.minecraft.item.Item.getItemFromBlock(BlockRegistry.palmSapling);
        case FRUIT :
        case KAPOK :
            return null;
        default :
            return net.minecraft.item.Item.getItemFromBlock(BlockRegistry.saplings);
    }
}