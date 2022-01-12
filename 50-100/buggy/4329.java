public boolean areEnemies(com.palmergames.bukkit.towny.object.Town t1, com.palmergames.bukkit.towny.object.Town t2) {
    if ((hasEnemies(t1)) && (hasEnemies(t2))) {
        for (int UID : towns.get(t1)) {
            if (UID == (t2.getUID())) {
                return true;
            }
        }
    }
    return false;
}