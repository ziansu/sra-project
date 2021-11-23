public void openMenu(org.bukkit.entity.Player player) {
    for (int i = 0; i < (this.optionIcons.length); i++) {
        if ((this.optionIcons[i]) != null) {
            this.inventory.setItem(i, this.optionIcons[i]);
        }
    }
    player.openInventory(this.inventory);
}