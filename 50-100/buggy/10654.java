public static void callbackRegister(mcp.mobius.waila.api.IWailaRegistrar registrar) {
    blusunrize.immersiveengineering.common.util.compat.waila.IEWailaDataProvider dataProvider = new blusunrize.immersiveengineering.common.util.compat.waila.IEWailaDataProvider();
    registrar.registerBodyProvider(dataProvider, blusunrize.immersiveengineering.common.blocks.plant.BlockIECrop.class);
    registrar.registerBodyProvider(dataProvider, blusunrize.immersiveengineering.common.blocks.wooden.TileEntityWoodenBarrel.class);
    registrar.registerStackProvider(dataProvider, blusunrize.immersiveengineering.common.blocks.TileEntityMultiblockPart.class);
    registrar.registerBodyProvider(dataProvider, blusunrize.immersiveengineering.api.energy.immersiveflux.IFluxReceiver.class);
    registrar.registerNBTProvider(dataProvider, blusunrize.immersiveengineering.api.energy.immersiveflux.IFluxReceiver.class);
    registrar.registerBodyProvider(dataProvider, blusunrize.immersiveengineering.api.energy.immersiveflux.IFluxProvider.class);
    registrar.registerNBTProvider(dataProvider, blusunrize.immersiveengineering.api.energy.immersiveflux.IFluxProvider.class);
}