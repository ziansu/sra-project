private se.ade.minecraft.adeplugin.warpstone.WarpStoneSignature getWarpSignature(org.bukkit.block.Block block) {
    org.bukkit.block.Block[] adjacent = getAdjacentBlocks(block);
    if (se.ade.minecraft.adeplugin.warpstone.WarpStoneSignature.validateMaterials(adjacent)) {
        return new se.ade.minecraft.adeplugin.warpstone.WarpStoneSignature(adjacent);
    }else {
        return null;
    }
}