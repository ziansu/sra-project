@net.minecraftforge.fml.common.Mod.EventHandler
public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    com.uberverse.arkcraft.ARKCraft.logger = new org.apache.logging.log4j.Logger(event.getModLog());
    com.uberverse.arkcraft.ARKCraft.proxy.preInit(event);
}