public void removeMarkersFromPlayer(org.bukkit.entity.Player p) {
    if (playerMap.containsKey(p.getUniqueId())) {
        me.lennartVH01.BuiltinBlockMarker.MarkedTask t = playerMap.get(p.getUniqueId());
        t.cancelTask();
        removeEntitys(p, t.ids);
    }
}