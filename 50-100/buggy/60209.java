@java.lang.SuppressWarnings(value = "unchecked")
@cpw.mods.fml.relauncher.SideOnly(value = cpw.mods.fml.relauncher.Side.CLIENT)
@java.lang.Override
public void getSubItems(net.minecraft.item.Item item, net.minecraft.creativetab.CreativeTabs aTab, @java.lang.SuppressWarnings(value = "rawtypes")
java.util.List subItems) {
    net.minecraft.item.ItemStack stack = new net.minecraft.item.ItemStack(item, 1);
    if ((getEmptyItem(stack)) == (this)) {
        subItems.add(stack);
    }
    if ((getChargedItem(stack)) == (this)) {
        net.minecraft.item.ItemStack charged = new net.minecraft.item.ItemStack(item, 1);
        ElectricItem.manager.charge(charged, 2147483647, getTier(charged), true, false);
        subItems.add(charged);
    }
}