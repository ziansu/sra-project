public void renderItem(net.minecraft.item.ItemStack item) {
    if ((item.getItem()) instanceof net.minecraft.item.ItemBlock) {
        renderItem(item, 0);
    }else {
        gregtech.api.items.GT_Generic_Item generic_item = ((gregtech.api.items.GT_Generic_Item) (item.getItem()));
        for (int i = 0; i < (generic_item.getRenderPasses(item)); i++) {
            renderItem(item, i);
        }
    }
}