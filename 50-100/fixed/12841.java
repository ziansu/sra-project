@net.minecraftforge.fml.common.Mod.EventHandler
public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    me.dmillerw.consequence.Consequence.INSTANCE.adapterDir = new java.io.File(event.getModConfigurationDirectory(), "consequence/adapters");
    if (!(me.dmillerw.consequence.Consequence.INSTANCE.adapterDir.exists()))
        me.dmillerw.consequence.Consequence.INSTANCE.adapterDir.mkdirs();
    
    me.dmillerw.consequence.Consequence.INSTANCE.scriptDir = new java.io.File(event.getModConfigurationDirectory(), "consequence/scripts");
    if (!(me.dmillerw.consequence.Consequence.INSTANCE.scriptDir.exists()))
        me.dmillerw.consequence.Consequence.INSTANCE.scriptDir.mkdirs();
    
    me.dmillerw.consequence.Consequence.INSTANCE.logger = event.getModLog();
    me.dmillerw.consequence.Consequence.PROXY.preInit(event);
}