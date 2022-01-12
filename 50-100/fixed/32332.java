protected static com.mcmoddev.lib.init.Block createNetherOre(com.mcmoddev.lib.material.MetalMaterial material) {
    if (material == null) {
        return null;
    }
    if (((com.mcmoddev.basemetals.util.Config.Options.enableBasics) && (material.hasOre)) && ((material.oreNether) == null)) {
        material.oreNether = com.mcmoddev.lib.init.Blocks.addBlock(new com.mcmoddev.lib.init.BlockMetalOre(material), "nether", material, ItemGroups.blocksTab);
    }
    return material.oreNether;
}