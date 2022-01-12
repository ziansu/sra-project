public void addPlayer(java.lang.String name) {
    if (enabled) {
        if (de.robingrether.idisguise.management.VersionHelper.requireVersion("v1_8_R3")) {
            ghostTeam.addEntry(name);
        }else {
            ghostTeam.addPlayer(org.bukkit.Bukkit.getOfflinePlayer(name));
        }
    }
}