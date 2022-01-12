public void pre(net.minecraftforge.fml.common.event.FMLPreInitializationEvent e) {
    MinecraftForge.EVENT_BUS.register(new x3d.utils.CommonEventHandler());
    x3d.proxy.CommonProxy.snw = NetworkRegistry.INSTANCE.newSimpleChannel(Ref.modid);
}