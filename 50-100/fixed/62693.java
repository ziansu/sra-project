@net.minecraftforge.fml.common.Mod.EventHandler
public void postInit(net.minecraftforge.fml.common.event.FMLPostInitializationEvent event) {
    pl.asie.charset.pipes.shifter.TileShifter.registerDefaultHandlers();
    for (pl.asie.charset.lib.material.ItemMaterial material : ItemMaterialRegistry.INSTANCE.getMaterialsByTypes("stone", "block", "!brick", "!cobblestone")) {
        BlockPipe.STONES.add(material);
        addPipeRecipe(material, null, "blockGlassColorless");
    }
}