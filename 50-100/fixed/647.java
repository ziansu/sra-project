public void playerSectionRemove(org.bukkit.entity.Player player, java.lang.String className) {
    if (className != null) {
        plugin.db.i(((("Remove config " + (player.getUniqueId().toString())) + " : ") + className));
        net.slipcor.classranks.core.PlayerClazzList playerClazz = playersClazzList.get(player.getUniqueId().toString());
        playerClazz.remove(className);
        plugin.db.i("Save player section after remove ");
        playerSectionWrite();
    }
}