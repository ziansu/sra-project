public static void cancelDownload() {
    boolean wasDownloading = wdl.WDL.downloading;
    if (wasDownloading) {
        wdl.WDL.minecraft.getSaveLoader().flushCache();
        wdl.WDL.saveHandler.flush();
        wdl.WDL.worldClient = null;
        wdl.WDL.saving = false;
        wdl.WDL.downloading = false;
        wdl.WDL.worldLoadingDeferred = false;
        wdl.WDL.minecraft.addScheduledTask(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                wdl.WDL.minecraft.renderGlobal.loadRenderers();
            }
        });
        wdl.WDLMessages.chatMessageTranslated(WDLMessageTypes.INFO, "wdl.messages.generalInfo.downloadCanceled");
    }
}