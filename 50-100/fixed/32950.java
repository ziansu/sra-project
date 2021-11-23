@java.lang.Override
public void getSubBlocks(net.minecraft.item.Item item, net.minecraft.creativetab.CreativeTabs tab, java.util.List<net.minecraft.item.ItemStack> list) {
    for (org.agecraft.metals.Metal metal : org.agecraft.metals.Metals.registry) {
        if ((metal != null) && (metal.hasDoor)) {
            list.add(new net.minecraft.item.ItemStack(item, 1, metal.id));
        }
    }
}