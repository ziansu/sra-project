public static void init() {
    panda2134.CLG.util.CLGReference.isServer = cpw.mods.fml.common.FMLCommonHandler.instance().getEffectiveSide().isServer();
    panda2134.CLG.util.CLGReference.isClient = cpw.mods.fml.common.FMLCommonHandler.instance().getEffectiveSide().isClient();
}