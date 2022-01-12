@net.minecraftforge.fml.common.Mod.EventHandler
public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    this.proxy.preInit(event);
    Config.instance.load(event);
    com.pam.harvestcraft.item.PamFoodRecipes.getRecipes();
    com.pam.harvestcraft.item.PamOtherRecipes.getRecipes();
    com.pam.harvestcraft.item.PamFoodOreDictionaryRegistry.getRegistry();
    com.pam.harvestcraft.item.PamOtherOreDictionaryRegistry.getRegistry();
    com.pam.harvestcraft.item.PamCropSeedDropRegistry.getSeedDrops();
    com.pam.harvestcraft.item.FishRegistry.registerItems();
    if (com.pam.harvestcraft.item.ItemRegistry.squiddropCalamari) {
        MinecraftForge.EVENT_BUS.register(new com.pam.harvestcraft.item.PamSquidDrops());
    }
}