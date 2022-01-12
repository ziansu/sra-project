@java.lang.Override
public void run() {
    handler.setGroupData(groupData);
    handler.setPlayerData(playerData);
    loadDatabaseSettings(handler, settings);
    for (org.bukkit.entity.Player player : com.nametagedit.plugin.utils.Utils.getOnline()) {
        com.nametagedit.plugin.api.data.PlayerData data = playerData.get(player.getUniqueId());
        if (data != null) {
            data.setName(player.getName());
        }
    }
    handler.applyTags();
}