@java.lang.Override
public void onEnable() {
    this.saveDefaultConfig();
    org.bukkit.Bukkit.getPluginManager().registerEvents(this, this);
    mysql = new red.man10.man10mysqlapi.MySQLAPI(this, "Man10Score");
    mysql.execute(createScoreLog);
    api = new red.man10.man10score.Man10ScoreAPI();
    loadSettingsToMemory();
    pda = new red.man10.Man10PlayerDataArchive.Man10PlayerDataArchiveAPI();
    thank_coolTime = getConfig().getLong("settings.thank_cooltime");
}