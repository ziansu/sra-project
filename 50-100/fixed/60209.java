@java.lang.SuppressWarnings(value = "unchecked")
@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
@java.lang.Override
public void getSubItems(net.minecraft.item.Item item, net.minecraft.creativetab.CreativeTabs aTab, @java.lang.SuppressWarnings(value = "rawtypes")
java.util.List subItems) {
    net.minecraft.item.ItemStack stack = new net.minecraft.item.ItemStack(item, 1);
    subItems.add(stack);
    net.minecraft.item.ItemStack charged = new net.minecraft.item.ItemStack(item, 1);
    ElectricItem.manager.charge(charged, 2147483647, getTier(charged), true, false);
    subItems.add(charged);
}