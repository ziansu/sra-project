@cpw.mods.fml.common.Mod.EventHandler
public void serverStarted(cpw.mods.fml.common.event.FMLServerStartedEvent event) {
    if ((event.getSide()) == (cpw.mods.fml.relauncher.Side.CLIENT)) {
        com.nguyenquyhy.SuperActivation.blocks.ItemStackHelper.initialize();
    }
}