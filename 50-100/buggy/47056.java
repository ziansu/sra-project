private net.minecraft.block.state.IBlockState getBlockForToolSpeed(net.minecraft.item.ItemTool itemTool) {
    if (itemTool instanceof net.minecraft.item.ItemPickaxe) {
        return Blocks.STONE.getDefaultState();
    }else
        if (itemTool instanceof net.minecraft.item.ItemSpade) {
            return Blocks.DIRT.getDefaultState();
        }else
            if (itemTool instanceof net.minecraft.item.ItemAxe) {
                return Blocks.LOG.getDefaultState();
            }
        
    
    return null;
}