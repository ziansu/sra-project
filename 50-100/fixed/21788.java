public static boolean toIdle(android.content.Context context) {
    MetaWatchService.WatchModes.IDLE = true;
    MetaWatchService.watchState = MetaWatchService.WatchStates.IDLE;
    if ((MetaWatchService.watchType) == (MetaWatchService.WatchType.DIGITAL)) {
        org.metawatch.manager.Idle.sendLcdIdle(context);
    }
    if ((org.metawatch.manager.Idle.numPages()) > 1) {
        org.metawatch.manager.Protocol.enableButton(0, 0, org.metawatch.manager.Idle.IDLE_NEXT_PAGE, 0);
        org.metawatch.manager.Protocol.enableButton(0, 0, org.metawatch.manager.Idle.IDLE_NEXT_PAGE, 1);
    }
    return true;
}