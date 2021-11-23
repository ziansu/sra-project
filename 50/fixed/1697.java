@java.lang.Override
public void init(net.minecraftforge.fml.common.event.FMLInitializationEvent event) {
    super.init(event);
    MinecraftForge.EVENT_BUS.register(new totoro.unreality.common.UpgradeRenderer());
}