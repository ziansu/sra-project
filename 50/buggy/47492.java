@net.minecraftforge.fml.common.Mod.EventHandler
public void init(net.minecraftforge.fml.common.event.FMLInitializationEvent event) {
    com.mrnobody.morecommands.util.Reference.setSavesDir(net.minecraftforge.fml.common.FMLCommonHandler.instance().getSavesDirectory());
    this.handlersLoaded = com.mrnobody.morecommands.core.MoreCommands.proxy.registerHandlers();
    com.mrnobody.morecommands.core.MoreCommands.proxy.init(event);
}