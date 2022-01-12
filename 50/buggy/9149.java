public void init(net.minecraftforge.fml.common.event.FMLInitializationEvent e) {
    NetworkRegistry.INSTANCE.registerGuiHandler(main.instance, new com.Sandvoxel.appeng.Proxy.GUIHandler());
}