@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onPlayerBreakEvent(com.blackgeckogames.server.mod.events.BlockEvent.BreakEvent event) {
    net.minecraft.entity.player.EntityPlayer player = event.getPlayer();
    com.blackgeckogames.server.mod.data.BGSPlayer bgsPlayer = com.blackgeckogames.server.mod.data.BGSPlayer.get(player);
    switch (bgsPlayer.getGameMode()) {
        case SKYBATTLE :
            com.blackgeckogames.server.mod.minigames.skybattle.SkyBattleEvents.onPlayerBreakEvent(event);
        case LOBBY :
        default :
            com.blackgeckogames.server.mod.events.LobbyEvent.onPlayerBreakEvent(event);
    }
}