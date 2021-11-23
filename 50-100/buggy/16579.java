private static void configureButtons() {
    logan.pickpocket.main.PickpocketItemInventory.nextButton = new org.bukkit.inventory.ItemStack(org.bukkit.Material.PAPER);
    logan.pickpocket.main.PickpocketItemInventory.backButton = new org.bukkit.inventory.ItemStack(org.bukkit.Material.PAPER);
    org.bukkit.inventory.meta.ItemMeta nextButtonMeta = logan.pickpocket.main.PickpocketItemInventory.nextButton.getItemMeta();
    nextButtonMeta.setDisplayName(((org.bukkit.ChatColor.GRAY) + "Next"));
    logan.pickpocket.main.PickpocketItemInventory.nextButton.setItemMeta(nextButtonMeta);
    org.bukkit.inventory.meta.ItemMeta backButtonMeta = logan.pickpocket.main.PickpocketItemInventory.backButton.getItemMeta();
    backButtonMeta.setDisplayName(((org.bukkit.ChatColor.GRAY) + "Back"));
}