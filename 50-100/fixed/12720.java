@java.lang.Override
public void connected() {
    appContext.setSIOService(sioService);
    loadPersistenceLayer(true);
    appContext.getMainBus().post(new ch.fork.AdHocRailway.ui.UpdateMainTitleEvent(((((AdHocRailway.TITLE) + " [") + url) + "]")));
    appContext.getMainBus().post(new ch.fork.AdHocRailway.ui.CommandLogEvent(("Successfully connected to AdHoc-Server: " + url)));
}