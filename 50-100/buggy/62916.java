private void InitCfg() {
    java.lang.System.out.println("Loading configuration file...");
    try {
        cfg = new Utilities.Config(Shard.Shard_Core.configDir);
    } catch (Exceptions.ConfigurationException e) {
    }
    uuid = java.util.UUID.fromString(cfg.Get("uuid"));
    if ((uuid) != null) {
        java.lang.System.out.println("Configuration file loaded.");
    }else {
        java.lang.System.err.println("Please initialize the Config with Nerv before proceeding!");
    }
}