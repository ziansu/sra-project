public void notifyBlocks(net.minecraft.world.World world, net.minecraft.util.math.BlockPos posStart) {
    for (fi.dy.masa.enderutilities.util.TemplateEnderUtilities.TemplateBlockInfo blockInfo : this.blocks) {
        net.minecraft.util.math.BlockPos pos = fi.dy.masa.enderutilities.util.TemplateEnderUtilities.transformedBlockPos(this.placement, blockInfo.pos).add(posStart);
        if ((blockInfo.tileEntityData) != null) {
            net.minecraft.tileentity.TileEntity te = world.getTileEntity(pos);
            if (te != null) {
                te.markDirty();
            }
        }
    }
}