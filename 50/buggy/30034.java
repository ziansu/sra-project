@java.lang.Override
public void getSubBlocks(net.minecraft.item.Item itemIn, net.minecraft.creativetab.CreativeTabs tab, java.util.List<net.minecraft.item.ItemStack> list) {
    for (me.dmillerw.storage.block.BlockPhantom.EnumType type : me.dmillerw.storage.block.BlockPhantom.EnumType.values()) {
        list.add(new net.minecraft.item.ItemStack(itemIn, 1, type.getMetadata()));
    }
}