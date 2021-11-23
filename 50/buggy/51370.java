@java.lang.Override
public boolean isItemValid(net.minecraft.item.ItemStack itemStack) {
    java.lang.System.out.println(("check: " + (itemStack.getItem().getUnlocalizedName().equals("item.ingotIron"))));
    return itemStack.getItem().getUnlocalizedName().equals("item.ingotIron");
}