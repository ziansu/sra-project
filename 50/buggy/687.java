@cpw.mods.fml.common.Mod.EventHandler
public void preInit(cpw.mods.fml.common.event.FMLPreInitializationEvent event) {
    graphich.ambiotic.main.Ambiotic.logger = event.getModLog();
    ((net.minecraft.client.resources.IReloadableResourceManager) (net.minecraft.client.Minecraft.getMinecraft().getResourceManager())).registerReloadListener(this);
    ClientCommandHandler.instance.registerCommand(new graphich.ambiotic.util.EvalCommand());
}