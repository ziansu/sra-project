public void registerBlock(com.builtbroken.mc.core.registry.ModManager manager, java.lang.String name, java.lang.String prefix, net.minecraft.block.Block block, java.lang.Class<? extends net.minecraft.item.ItemBlock> itemBlock) {
    cpw.mods.fml.common.registry.GameRegistry.registerBlock(block, (itemBlock != null ? itemBlock : net.minecraft.item.ItemBlock.class), name);
    if (((block.getUnlocalizedName()) == null) || (block.getUnlocalizedName().contains("null"))) {
        block.setBlockName((((modPrefix) != null ? modPrefix : "") + name));
    }
}