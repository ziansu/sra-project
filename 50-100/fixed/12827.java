@net.minecraftforge.fml.common.Mod.EventHandler
public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    net.minecraftforge.fml.common.registry.GameRegistry.register((blockTorch = new com.builtbroken.bonetorch.torch.BlockBoneTorch()));
    net.minecraftforge.fml.common.registry.GameRegistry.register(new com.builtbroken.bonetorch.torch.ItemBlockBoneTorch(blockTorch), blockTorch.getRegistryName());
    if ((event.getSide()) == (net.minecraftforge.fml.relauncher.Side.CLIENT)) {
        blockTorch.registerModel();
    }
}