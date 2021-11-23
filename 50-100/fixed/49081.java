public net.simcra.core.init.AbcModItems createItemBlocks(net.simcra.core.AbcMod mod) {
    java.util.Iterator<net.minecraft.block.Block> blockIter = mod.getSidedProxy().getModBlocks().getBlockIterator();
    while (blockIter.hasNext()) {
        net.minecraft.block.Block nextBlock = blockIter.next();
        items.add(new net.minecraft.item.ItemBlock(nextBlock).setUnlocalizedName(nextBlock.getUnlocalizedName().substring(5)));
    } 
    return this;
}