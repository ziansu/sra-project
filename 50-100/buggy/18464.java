private static net.minecraftforge.fluids.BlockFluidClassic regFluidBlock(net.minecraft.creativetab.CreativeTabs tab, net.minecraftforge.fluids.Fluid fluid, java.lang.String name) {
    net.minecraftforge.fluids.BlockFluidClassic block = new net.minecraftforge.fluids.BlockFluidClassic(fluid, net.minecraft.block.material.Material.WATER);
    block.setCreativeTab(tab);
    block.setUnlocalizedName(name);
    block.setRegistryName(BigCapacitorsMod.modid, name);
    net.minecraftforge.fml.common.registry.GameRegistry.register(block);
    net.minecraft.item.Item item = new net.minecraft.item.ItemBlock(block);
    item.setRegistryName(BigCapacitorsMod.modid, name);
    net.minecraftforge.fml.common.registry.GameRegistry.register(item);
    return block;
}