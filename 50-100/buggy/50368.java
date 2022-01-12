public void Init() {
    if (Heart.Heart_Core.initialized) {
        return ;
    }
    if (!(headless)) {
        InitGUI();
        RedirectSystemStreams();
    }
    InitVariables();
    InitLog();
    InitCfg();
    InitMediaIndex();
    updateCheckerThread = new Heart.UpdateCheckerThread(true);
    updateCheckerThread.start();
}