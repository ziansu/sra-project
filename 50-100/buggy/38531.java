public void notifyBlocks(net.minecraft.world.World world, net.minecraft.util.math.BlockPos posStart) {
    this.templateFacing = fi.dy.masa.enderutilities.util.PositionUtils.getFacingFromPositions(posStart, posStart.add(this.size));
    for (fi.dy.masa.enderutilities.util.TemplateEnderUtilities.TemplateBlockInfo blockInfo : this.blocks) {
        net.minecraft.util.math.BlockPos pos = fi.dy.masa.enderutilities.util.TemplateEnderUtilities.transformedBlockPos(this.placement, this.templateFacing, blockInfo.pos).add(posStart);
        if ((blockInfo.tileEntityData) != null) {
            net.minecraft.tileentity.TileEntity te = world.getTileEntity(pos);
            if (te != null) {
                te.markDirty();
            }
        }
    }
}