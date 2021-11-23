public static java.lang.Integer getMetaID(org.bukkit.inventory.ItemStack stack) {
    if ((org.wargamer2010.signshop.blocks.SignShopItemMeta.isLegacy()) || (!(org.wargamer2010.signshop.blocks.SignShopItemMeta.hasMeta(stack))))
        return -1;
    
    return org.wargamer2010.signshop.blocks.SignShopItemMeta.getMetaID(stack, null);
}