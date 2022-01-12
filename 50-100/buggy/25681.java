public net.minecraft.item.ItemStack recalculateRRPath(mekanism.common.tile.TileEntityLogisticalSorter outputter, mekanism.common.base.ILogisticalTransporter transporter, int min) {
    mekanism.common.content.transporter.TransporterPathfinder.Destination newPath = mekanism.common.content.transporter.TransporterPathfinder.getNewRRPath(transporter, this, outputter, min);
    if (newPath == null) {
        return itemStack;
    }
    pathType = mekanism.common.content.transporter.TransporterStack.Path.DEST;
    idleDir = net.minecraftforge.common.util.ForgeDirection.UNKNOWN;
    setPath(newPath.path);
    initiatedPath = true;
    return newPath.rejected;
}