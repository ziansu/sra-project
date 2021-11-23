@net.minecraftforge.fml.common.Mod.EventHandler
public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    io.github.mribby.endercompass.EnderCompassMod.network = NetworkRegistry.INSTANCE.newSimpleChannel("endercompass");
    io.github.mribby.endercompass.EnderCompassMod.network.registerMessage(new io.github.mribby.endercompass.network.MessageGetStrongholdPos(), io.github.mribby.endercompass.network.MessageGetStrongholdPos.class, 0, Side.SERVER);
    io.github.mribby.endercompass.EnderCompassMod.network.registerMessage(new io.github.mribby.endercompass.network.MessageSetStrongholdPos(), io.github.mribby.endercompass.network.MessageSetStrongholdPos.class, 1, Side.CLIENT);
    MinecraftForge.EVENT_BUS.register(this);
    io.github.mribby.endercompass.EnderCompassMod.proxy.preInit();
}