public java.lang.String getRandomSpawn(org.bukkit.entity.Player p) {
    java.util.ArrayList<java.lang.String> allowedSpawns = new java.util.ArrayList<>();
    for (java.lang.String name : getSpawns()) {
        if (p.hasPermission(("multispawn.spawn." + name))) {
            allowedSpawns.add(name);
        }
    }
    java.util.Collections.shuffle(allowedSpawns, random);
    return allowedSpawns.get(0);
}