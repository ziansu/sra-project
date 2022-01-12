public static cyano.orespawn.worldgen.OreSpawnData parseOreSpawnData(com.google.gson.JsonObject jsonEntry) {
    java.lang.String blockName = jsonEntry.get("blockID").getAsString();
    if ((blockName == null) || ((net.minecraft.block.Block.getBlockFromName(blockName)) == null)) {
        if (cyano.orespawn.OreSpawn.ignoreNonExistant) {
            net.minecraftforge.fml.common.FMLLog.warning("%s: ignoring orespawn data for %s because that block does not exist", OreSpawn.MODID, blockName);
        }else {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Ore block with ID %s does not exist!", blockName));
        }
    }
    return new cyano.orespawn.worldgen.OreSpawnData(jsonEntry);
}