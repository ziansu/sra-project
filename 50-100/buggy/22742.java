protected static void init(org.bukkit.plugin.Plugin plugin, com.comphenix.protocol.ProtocolConfig config, com.comphenix.protocol.ProtocolManager manager, com.comphenix.protocol.error.ErrorReporter reporter, com.google.common.util.concurrent.ListeningScheduledExecutorService executorAsync, com.google.common.util.concurrent.ListeningScheduledExecutorService executorSync) {
    org.apache.commons.lang.Validate.isTrue((!(com.comphenix.protocol.ProtocolLibrary.initialized)), "ProtocolLib has already been initialized.");
    com.comphenix.protocol.ProtocolLibrary.plugin = plugin;
    com.comphenix.protocol.ProtocolLibrary.config = config;
    com.comphenix.protocol.ProtocolLibrary.manager = manager;
    com.comphenix.protocol.ProtocolLibrary.reporter = reporter;
    com.comphenix.protocol.ProtocolLibrary.executorAsync = executorAsync;
    com.comphenix.protocol.ProtocolLibrary.executorSync = executorSync;
    com.comphenix.protocol.ProtocolLogger.init(plugin);
    com.comphenix.protocol.ProtocolLibrary.initialized = true;
}