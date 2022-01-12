public void removeTrap(org.bukkit.Location loc) {
    if (isTrapped(loc)) {
        traps = traps.replace(formatLocation(loc), "");
        save();
    }
}