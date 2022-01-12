@java.lang.Override
public void cacheImportant(net.minecraft.tileentity.TileEntity tile, int side) {
    if ((attachments[side]) instanceof cofh.thermaldynamics.duct.attachments.filter.IFilterAttachment) {
        filterCache[side] = ((cofh.thermaldynamics.duct.attachments.filter.IFilterAttachment) (attachments[side])).getFluidFilter();
    }
    cache[side] = tile.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, net.minecraft.util.EnumFacing.VALUES[(side ^ 1)]);
}