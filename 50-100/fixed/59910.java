public net.minecraft.item.ItemStack recalculatePath(mekanism.common.base.ILogisticalTransporter transporter, int min) {
    mekanism.common.content.transporter.TransporterPathfinder.Destination newPath = mekanism.common.content.transporter.TransporterPathfinder.getNewBasePath(transporter, this, min);
    if (newPath == null) {
        return itemStack;
    }
    idleDir = net.minecraftforge.common.util.ForgeDirection.UNKNOWN;
    setPath(newPath.path, mekanism.common.content.transporter.TransporterStack.Path.DEST);
    initiatedPath = true;
    return newPath.rejected;
}