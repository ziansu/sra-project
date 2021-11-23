@net.minecraftforge.fml.common.Mod.EventHandler
public void init(net.minecraftforge.fml.common.event.FMLInitializationEvent event) {
    talecraft.TaleCraft.proxy.init(event);
    talecraft.TCSoundHandler.init();
    NetworkRegistry.INSTANCE.registerGuiHandler(talecraft.TaleCraft.instance, new talecraft.util.GuiHandler());
    talecraft.util.ReflectionUtil.replaceMusicTicker();
}