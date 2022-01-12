@net.minecraftforge.fml.common.Mod.EventHandler
public void init(net.minecraftforge.fml.common.event.FMLInitializationEvent event) {
    talecraft.TaleCraft.proxy.init(event);
    NetworkRegistry.INSTANCE.registerGuiHandler(talecraft.TaleCraft.instance, new talecraft.util.GuiHandler());
}