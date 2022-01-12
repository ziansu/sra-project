@java.lang.Override
@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
public void getSubItems(net.minecraft.item.Item itemIn, net.minecraft.creativetab.CreativeTabs tab, java.util.List<net.minecraft.item.ItemStack> subItems) {
    for (int meta = 0; meta < (net.darkhax.darkutils.items.ItemMaterial.varients.length); meta++)
        subItems.add(new net.minecraft.item.ItemStack(this, 1, meta));
    
}