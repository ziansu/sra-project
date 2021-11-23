public static void onSaveComplete() {
    wdl.WDL.minecraft.getSaveLoader().flushCache();
    wdl.WDL.saveHandler.flush();
    wdl.WDL.worldClient = null;
    wdl.WDL.minecraft.addScheduledTask(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            wdl.WDL.minecraft.renderGlobal.loadRenderers();
        }
    });
    wdl.WDL.worldLoadingDeferred = false;
    if (wdl.WDL.downloading) {
        wdl.WDLMessages.chatMessageTranslated(WDLMessageTypes.INFO, "wdl.messages.generalInfo.saveComplete.startingAgain");
        wdl.WDL.loadWorld();
        return ;
    }
    wdl.WDLMessages.chatMessageTranslated(WDLMessageTypes.INFO, "wdl.messages.generalInfo.saveComplete.done");
}