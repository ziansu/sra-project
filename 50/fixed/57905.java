@net.minecraftforge.fml.common.Mod.EventHandler
public void init(net.minecraftforge.fml.common.event.FMLInitializationEvent event) {
    floatingwaterfix.worldgen.WorldGeneration.compileBiomesConfig();
    net.minecraftforge.fml.common.registry.GameRegistry.registerWorldGenerator(new floatingwaterfix.worldgen.WorldGeneration(), 0);
}