public void init() {
    if (Heart.Heart_Core.initialized) {
        return ;
    }
    if (!(headless)) {
        initGUI();
        redirectSystemStreams();
    }
    initVariables();
    initCfg();
    initLog();
    shareMediaDir();
    initMediaManager();
    initPatchThread();
}