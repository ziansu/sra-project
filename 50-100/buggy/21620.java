public java.util.ArrayList<java.lang.String> getSpawns() {
    java.util.Set<java.lang.String> spawns = getConfig().getConfigurationSection("spawns").getKeys(false);
    java.util.ArrayList<java.lang.String> spawnsNew = new java.util.ArrayList<>();
    for (java.lang.String name : spawns) {
        spawns.add(name);
    }
    return spawnsNew;
}