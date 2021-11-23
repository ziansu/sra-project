@net.minecraftforge.fml.common.Mod.EventHandler
public void Init(net.minecraftforge.fml.common.event.FMLInitializationEvent event) {
    NetworkRegistry.INSTANCE.registerGuiHandler(alexndr.plugins.Machines.Machines.INSTANCE, new alexndr.plugins.Machines.helpers.FancyFurnaceGuiHandler());
    alexndr.plugins.Machines.Machines.proxy.Init(event);
}