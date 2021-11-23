private void executeCommand(floatingmuseum.sample.sonic.AppInfo appInfo) {
    switch (appInfo.getState()) {
        case floatingmuseum.sonic.Sonic.STATE_NONE :
        case floatingmuseum.sonic.Sonic.STATE_START :
        case floatingmuseum.sonic.Sonic.STATE_PAUSE :
        case floatingmuseum.sonic.Sonic.STATE_ERROR :
        case floatingmuseum.sonic.Sonic.STATE_CANCEL :
            sonic.addTask(appInfo.getUrl());
            break;
        case floatingmuseum.sonic.Sonic.STATE_WAITING :
        case floatingmuseum.sonic.Sonic.STATE_DOWNLOADING :
            sonic.stopTask(appInfo.getUrl());
            break;
        case floatingmuseum.sonic.Sonic.STATE_FINISH :
            sonic.addTask(appInfo.getUrl());
            break;
    }
}