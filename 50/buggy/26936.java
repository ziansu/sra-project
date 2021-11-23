@cpw.mods.fml.common.Mod.EventHandler
public void serverStopping(cpw.mods.fml.common.event.FMLServerStoppedEvent event) {
    try {
        com.mcgame.scdiary.management.ScreenshotManager.getInstance().saveScrenshots();
    } catch (java.io.IOException e) {
        com.mcgame.scdiary.ScreenshotDiary.logger.log(java.util.logging.Level.WARNING, "Errors occured during saving screenshots");
        e.printStackTrace();
    }
}