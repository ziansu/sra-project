@java.lang.Override
public void run() {
    bammerbom.ultimatecore.bukkit.r.updater.waitForThread();
    try {
        if (bammerbom.ultimatecore.bukkit.r.updater.getResult().equals(UpdateResult.UPDATE_AVAILABLE)) {
            bammerbom.ultimatecore.bukkit.r.log("There is an update available for UltimateCore.");
            bammerbom.ultimatecore.bukkit.r.log("Use /uc update to update UltimateCore.");
        }
    } catch (java.lang.Exception ex) {
        bammerbom.ultimatecore.bukkit.resources.classes.ErrorLogger.log(ex, "Update check failed.");
    }
}