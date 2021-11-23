private boolean hasEnemies(com.palmergames.bukkit.towny.object.Town t) {
    if (towns.containsKey(t.getUID())) {
        return (towns.get(t.getUID())) != null;
    }
    return false;
}