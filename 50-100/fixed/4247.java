public static void registerBlock(net.minecraft.block.Block block, java.lang.Class<? extends io.github.mc_umod.util.ItemBlock> bl) {
    if ((io.github.mc_umod.util.URegistryUtils.reg) == null) {
        io.github.mc_umod.util.URegistryUtils.reg = new io.github.mc_umod.util.CoreCommonRegistry();
    }
    io.github.mc_umod.util.URegistryUtils.reg.registerBlock(block, bl, block.getUnlocalizedName().substring(5));
    io.github.mc_umod.util.URegistryUtils.reg.registerOreDictionary(block, block.getUnlocalizedName().substring(5));
}