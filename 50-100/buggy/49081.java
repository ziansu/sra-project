public net.simcra.core.init.AbcModItems createItemBlocks(net.simcra.core.AbcMod mod) {
    java.util.Iterator<net.minecraft.block.Block> blockIter = mod.getSidedProxy().getModBlocks().getBlockIterator();
    while (blockIter.hasNext()) {
        net.minecraft.block.Block nextBlock = blockIter.next();
        java.lang.String blockId = nextBlock.getUnlocalizedName().substring(5);
        items.add(new net.minecraft.item.ItemBlock(nextBlock).setUnlocalizedName(blockId).setRegistryName(mod.getModId(), blockId));
    } 
    return this;
}