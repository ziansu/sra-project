@java.lang.Override
public void onDisable() {
    com.talesdev.talesz.IronDoorManager.forceProcessIronDoor();
    cancelTask();
    com.talesdev.talesz.thirst.Thirst.getThirstRule().saveRule();
    try {
        com.talesdev.talesz.thirst.Thirst.saveAll();
    } catch (java.io.IOException e) {
        getLogger().log(java.util.logging.Level.SEVERE, "Unable to save thirst data to disk!");
        e.printStackTrace();
    }
    com.talesdev.talesz.world.BlockRuleManager.saveConfigFile();
    getLogger().info("TalesZ has been disabled!");
}