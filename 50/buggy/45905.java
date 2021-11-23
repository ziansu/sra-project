@java.lang.Override
public io.nxt3.ioclassic.Engine onCreateEngine() {
    io.nxt3.ioclassic.IOClassicWatchFaceService.sSettings = io.nxt3.ioclassic.config.Settings.getInstance(getApplicationContext());
    return new io.nxt3.ioclassic.IOClassicWatchFaceService.IOClassicWatchFaceEngine();
}