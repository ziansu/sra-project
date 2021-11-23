public boolean addItems(org.bukkit.entity.Player sender, org.bukkit.inventory.ItemStack stack, double basePrice, boolean isInfinite) throws java.lang.Exception {
    com.wjbolles.eco.model.ItemListing listing = new com.wjbolles.eco.model.ItemListing(stack, isInfinite, plugin.getPluginConfig());
    listing.setBasePrice(basePrice);
    listingDao.insertItemListing(listing);
    return true;
}