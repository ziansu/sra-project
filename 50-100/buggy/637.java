public static boolean isContain(net.minecraft.item.ItemStack item1, net.minecraft.item.ItemStack item2) {
    if ((net.minecraft.item.Item.getIdFromItem(item1.getItem())) == (net.minecraft.item.Item.getIdFromItem(item2.getItem()))) {
        if ((item1.stackSize) >= (item2.stackSize)) {
            return true;
        }else {
            return false;
        }
    }else {
        return false;
    }
}