public void setRace(java.lang.String race) {
    this.race = race;
    config.set("Race", this.race);
    getConfigRace();
    player.sendMessage(((((((header) + (org.bukkit.ChatColor.GRAY)) + "You Have Chosen The Path Of The ") + (org.bukkit.ChatColor.WHITE)) + (this.race)) + "!"));
}