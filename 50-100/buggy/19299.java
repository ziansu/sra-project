public net.minecraft.item.ItemStack getStackAtNode(int i) {
    if ((headptr) == null) {
        return null;
    }
    if (i > (getSize())) {
        return null;
    }
    com.limplungs.blockhole.Node temp = headptr;
    for (int j = 1; j < i; j++) {
        temp = temp.next;
    }
    return temp.item;
}