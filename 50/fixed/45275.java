private boolean hasEnemies(com.palmergames.bukkit.towny.object.Town t) {
    if (towns.containsKey(t.getName())) {
        return !(towns.get(t.getName()).isEmpty());
    }
    return false;
}