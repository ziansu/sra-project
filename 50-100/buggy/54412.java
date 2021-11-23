private com.hexicraft.trade.ReturnCode buy(org.bukkit.entity.Player player, java.lang.String alias, java.lang.String amountStr) {
    int amount;
    try {
        amount = java.lang.Integer.parseInt(amountStr);
    } catch (java.lang.NumberFormatException e) {
        return ReturnCode.INVALID_ARGUMENT;
    }
    com.hexicraft.trade.ItemListing listing = itemMap.getFromAlias(alias);
    if (listing == null) {
        return ReturnCode.ITEM_NOT_FOUND;
    }else {
        org.bukkit.inventory.ItemStack item = listing.buy(amount, player);
        if (item != null) {
            addItem(player.getInventory(), item);
        }
        return ReturnCode.SUCCESS;
    }
}