public boolean addItems(org.bukkit.entity.Player sender, org.bukkit.inventory.ItemStack stack, double basePrice, boolean isInfinite) {
    try {
        com.wjbolles.eco.model.ItemListing listing = new com.wjbolles.eco.model.ItemListing(stack, isInfinite, plugin.getPluginConfig());
        listing.setBasePrice(basePrice);
        listingDao.insertItemListing(listing);
    } catch (java.lang.Exception e) {
        sender.sendMessage("An unexpected error has occurred.");
        e.printStackTrace();
        return false;
    }
    return true;
}