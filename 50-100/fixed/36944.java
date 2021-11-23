@java.lang.Override
protected void onEnable() throws java.lang.Throwable {
    me.alf21.weaponsystem.WeaponSystem.instance = this;
    eventManager = getEventManager();
    eventManagerNode = eventManager.createChildNode();
    playerLifecycleHolder = new net.gtaun.shoebill.common.player.PlayerLifecycleHolder(eventManager);
    playerLifecycleHolder.registerClass(me.alf21.weaponsystem.PlayerData.class);
    playerManager = new me.alf21.weaponsystem.PlayerManager();
    mysqlConnection = new me.alf21.weaponsystem.MysqlConnection();
    mysqlConnection.initConnection();
    mysqlConnection.makeDatabase();
}