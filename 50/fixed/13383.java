@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void RegBEvent(net.minecraftforge.event.RegistryEvent.Register<net.minecraft.block.Block> e) {
    e.getRegistry().register(BlockInit.xdb.setRegistryName("xdb"));
}