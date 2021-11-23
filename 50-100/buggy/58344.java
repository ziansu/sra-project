public void save() {
    java.util.ArrayList<java.lang.String> value = new java.util.ArrayList<>();
    for (us.talabrek.ultimateskyblock.island.OrphanLogic.Orphan orphan : new java.util.ArrayList<>(orphaned)) {
        value.add(orphan.toString());
    }
    config.set("orphans", value);
    try {
        config.save(configFile);
    } catch (java.io.IOException e) {
        plugin.getLogger().warning(("Unable to store orphans: " + e));
    }
}