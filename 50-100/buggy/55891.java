public void loadLogger() {
    if ((logDebugToFile) && ((logger) == null))
        logger = new com.Ben12345rocks.AdvancedCore.Util.Logger.Logger(plugin, new java.io.File(plugin.getDataFolder(), (("Log" + (java.io.File.separator)) + "Log.txt")));
    
}