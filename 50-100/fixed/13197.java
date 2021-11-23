public void execute() {
    for (int id : dimensions) {
        mcjty.rftools.RFTools.log(("DimensionSyncPacket: Registering id: id = " + id));
        if (!(net.minecraftforge.common.DimensionManager.isDimensionRegistered(id))) {
            net.minecraftforge.common.DimensionManager.registerProviderType(id, mcjty.rftools.dimension.world.GenericWorldProvider.class, false);
            net.minecraftforge.common.DimensionManager.registerDimension(id, id);
        }
    }
}