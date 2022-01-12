public void setType(java.lang.String type) {
    this.type = type;
    config.set("Type", this.type);
    getConfigType();
    player.sendMessage(((((((header) + (org.bukkit.ChatColor.GRAY)) + "You Have Chosen The Path Of The ") + (org.bukkit.ChatColor.WHITE)) + (this.type)) + "!"));
}