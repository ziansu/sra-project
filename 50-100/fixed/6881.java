private static void addGenericItem(net.minecraft.item.Item item) {
    com.xplosivesnet.explochem.xplosivesnet_items.items[com.xplosivesnet.explochem.xplosivesnet_items.counter] = item;
    if ((com.xplosivesnet.explochem.xplosivesnet_items.counter) != 0)
        item.setContainerItem(com.xplosivesnet.explochem.xplosivesnet_items.items[0]);
    
    (com.xplosivesnet.explochem.xplosivesnet_items.counter)++;
    cpw.mods.fml.common.registry.GameRegistry.registerItem(item, item.getUnlocalizedName());
}