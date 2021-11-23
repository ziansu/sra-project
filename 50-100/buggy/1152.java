public static void registerBlock(net.minecraft.block.Block block, java.lang.String id, java.lang.Class<? extends net.minecraft.item.ItemBlock> item, java.lang.Object... par) {
    cd4017be.lib.BlockItemRegistry.blocks.put(id, block);
    net.minecraftforge.fml.common.registry.GameRegistry.registerBlock(block, item, id, par);
    if (item.equals(net.minecraft.item.ItemBlock.class))
        cd4017be.lib.BlockItemRegistry.registerItemStack(new net.minecraft.item.ItemStack(block), block.getUnlocalizedName());
    
}