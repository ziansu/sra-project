@cpw.mods.fml.common.eventhandler.SubscribeEvent(priority = cpw.mods.fml.common.eventhandler.EventPriority.HIGHEST)
public void onPlayerLoggedIn(cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent event) {
    com.MadokaMagica.mod_madokaMagica.trackers.PMDataTracker oldTracker = com.MadokaMagica.mod_madokaMagica.managers.PlayerDataTrackerManager.getInstance().getTrackerByUUID(event.player.getPersistentID());
    if (oldTracker != null) {
        oldTracker.entity = event.player;
        oldTracker.loadTagData();
        return ;
    }
    java.lang.System.out.println("getTrackerByUUID returned null. Calling new PMDataTracker(...);");
    com.MadokaMagica.mod_madokaMagica.trackers.PMDataTracker tracker = new com.MadokaMagica.mod_madokaMagica.trackers.PMDataTracker(event.player);
    com.MadokaMagica.mod_madokaMagica.managers.PlayerDataTrackerManager.getInstance().addDataTracker(tracker);
    tracker.loadTagData();
}