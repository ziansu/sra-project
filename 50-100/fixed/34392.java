@java.lang.Override
public boolean isItemValid(net.minecraft.item.ItemStack itemStack) {
    if ((itemStack != null) && ((itemStack.getItem()) instanceof com.weebly.pixelbots.item.ItemMedal)) {
        return (((super.isItemValid(itemStack)) && ((itemStack.getItem()) instanceof com.weebly.pixelbots.item.ItemMedal)) && (!(this.getHasStack()))) && (medafighter.getDisplayNameString().equals(((com.weebly.pixelbots.item.ItemMedal) (itemStack.getItem())).getMedafighterName(itemStack)));
    }
    return false;
}