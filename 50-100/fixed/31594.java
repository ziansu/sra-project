public static void cancelDownload() {
    boolean wasDownloading = wdl.WDL.downloading;
    if (wasDownloading) {
        wdl.WDL.minecraft.getSaveLoader().flushCache();
        wdl.WDL.saveHandler.flush();
        wdl.WDL.worldClient = null;
        wdl.WDL.saving = false;
        wdl.WDL.downloading = false;
        wdl.WDL.worldLoadingDeferred = false;
        wdl.WDLMessages.chatMessageTranslated(WDLMessageTypes.INFO, "wdl.messages.generalInfo.downloadCanceled");
    }
}