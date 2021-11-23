public static void load(mcp.mobius.waila.api.IWailaRegistrar registrar) {
    registrar.registerStackProvider(crazypants.enderio.waila.WailaCompat.INSTANCE, crazypants.util.IFacade.class);
    registrar.registerStackProvider(crazypants.enderio.waila.WailaCompat.INSTANCE, crazypants.enderio.block.BlockDarkSteelAnvil.class);
    registrar.registerBodyProvider(crazypants.enderio.waila.WailaCompat.INSTANCE, crazypants.enderio.BlockEio.class);
    registrar.registerNBTProvider(crazypants.enderio.waila.WailaCompat.INSTANCE, crazypants.enderio.TileEntityEio.class);
    mcp.mobius.waila.api.impl.ConfigHandler.instance().addConfig(EnderIO.MOD_NAME, "facades.hidden", crazypants.util.Lang.localize("waila.config.hiddenfacades"));
}