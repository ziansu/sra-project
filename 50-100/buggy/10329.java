public mcjty.lib.tools.ItemStackList getCraftableItems() {
    mcjty.lib.tools.ItemStackList items = mcjty.lib.tools.ItemStackList.create(0);
    for (net.minecraft.util.math.BlockPos p : processorList) {
        net.minecraft.tileentity.TileEntity te = getWorld().getTileEntity(p);
        if (te instanceof mcjty.rftoolscontrol.blocks.processor.ProcessorTileEntity) {
            mcjty.rftoolscontrol.blocks.processor.ProcessorTileEntity processor = ((mcjty.rftoolscontrol.blocks.processor.ProcessorTileEntity) (te));
            processor.getCraftableItems(items);
        }
    }
    return items;
}