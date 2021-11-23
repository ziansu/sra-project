protected void add(java.util.List list, net.minecraft.item.Item item) {
    if (item != null) {
        item.getSubItems(item, this, list);
    }
}