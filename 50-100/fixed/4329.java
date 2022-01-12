public boolean areEnemies(com.palmergames.bukkit.towny.object.Town t1, com.palmergames.bukkit.towny.object.Town t2) {
    if ((hasEnemies(t1)) && (hasEnemies(t2))) {
        for (java.lang.String name : towns.get(t1.getName())) {
            if (name.equals(t2.getName())) {
                return true;
            }
        }
    }
    return false;
}