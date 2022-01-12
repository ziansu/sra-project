@java.lang.Override
public boolean isItemValid(net.minecraft.item.ItemStack stack) {
    return isBlockOnly() ? (((stack.getItem()) instanceof net.minecraft.item.ItemBlock) || ((stack.getItem()) instanceof net.minecraft.item.ItemBlockSpecial)) || ((stack.getItem()) instanceof net.minecraftforge.common.IPlantable) : true;
}