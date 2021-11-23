public void init() {
    if (Shard.Shard_Core.initialized) {
        return ;
    }
    if (!(headless)) {
        initGUI();
        redirectSystemStreams();
    }
    java.lang.System.out.println(("VERSION: " + (Shard.Shard_Core.SHARD_VERSION)));
    initVariables();
    initLog();
    java.lang.System.out.println((("###############" + (Shard.Shard_Core.systemName)) + "###############"));
    initCfg();
}