@org.bukkit.event.EventHandler
public void onPlayerDeath(org.bukkit.event.entity.PlayerDeathEvent event) {
    if ((!(event.getKeepInventory())) && (com.mstiles92.plugins.bookrules.config.Config.shouldKeepBooksOnDeath())) {
        java.util.List<org.bukkit.inventory.ItemStack> booksToKeep = new java.util.ArrayList<>();
        for (org.bukkit.inventory.ItemStack item : event.getDrops()) {
            if (com.mstiles92.plugins.bookrules.util.BookUtils.isBookRulesBook(item)) {
                booksToKeep.add(item);
            }
        }
        event.getDrops().removeAll(booksToKeep);
    }
}