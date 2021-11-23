public void onLeaveInstance(com.aionemu.gameserver.model.gameobjects.player.Player player) {
    if (!(com.aionemu.gameserver.configs.main.EventSystem.ENABLE_ONEVONE)) {
        return ;
    }
    for (int world : OneVsOneStruct.worldid) {
        if ((player.getWorldId()) != world) {
            return ;
        }
    }
    removePlayerFromFastList(player);
    player.setInPkMode(false);
    player.setWinCount(0);
    setRound(player, 0);
    player.setInDuelArena(false);
    com.aionemu.gameserver.services.teleport.TeleportService2.moveToBindLocation(player, false);
}