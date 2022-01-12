@java.lang.Override
public void getSubBlocks(io.github.mc_umod.block.Item item, net.minecraft.creativetab.CreativeTabs creativetab, java.util.List list) {
    for (int i = 0; i < (io.github.mc_umod.enumtype.EnumTypeBaseStuff.values().length); i++) {
        list.add(new io.github.mc_umod.block.ItemStack(item, 1, i));
    }
}