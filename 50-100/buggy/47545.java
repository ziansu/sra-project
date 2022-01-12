public void loadPlayerIfNeeded(java.lang.String uuid) {
    if (table.containsKey(uuid)) {
        if ((table.get(uuid).size()) == (getColumns().size())) {
            com.Ben12345rocks.AdvancedCore.AdvancedCoreHook.getInstance().debug("Player loaded already");
            return ;
        }
    }
    loadPlayer(uuid);
}