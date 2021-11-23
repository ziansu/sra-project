@java.lang.Override
public void onDisable() {
    getLogger().log(java.util.logging.Level.INFO, "Bye");
    saveConfig();
}