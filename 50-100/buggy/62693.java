@net.minecraftforge.fml.common.Mod.EventHandler
public void postInit(net.minecraftforge.fml.common.event.FMLPostInitializationEvent event) {
    pl.asie.charset.pipes.shifter.TileShifter.registerDefaultHandlers();
    for (pl.asie.charset.lib.material.ItemMaterial material : ItemMaterialRegistry.INSTANCE.getMaterialsByTypes("stone", "block", "!brick", "!cobblestone")) {
        BlockPipe.STONES.add(material);
        addPipeRecipe(material, null, "blockGlassColorless");
        for (net.minecraft.item.EnumDyeColor color : net.minecraft.item.EnumDyeColor.values()) {
            addPipeRecipe(material, color, pl.asie.charset.lib.utils.ColorUtils.getOreDictEntry("blockGlass", color.getMetadata()));
        }
    }
}