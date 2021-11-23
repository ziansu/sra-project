public void removeDimension(int id) {
    mcjty.rftoolsdim.dimensions.description.DimensionDescriptor descriptor = dimensions.get(id);
    dimensions.remove(id);
    dimensionToID.remove(descriptor);
    dimensionInformation.remove(id);
    if (net.minecraftforge.common.DimensionManager.isDimensionRegistered(id)) {
        net.minecraftforge.common.DimensionManager.unregisterDimension(id);
    }
    net.minecraftforge.common.DimensionManager.unregisterDimension(id);
}