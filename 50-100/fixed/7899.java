public static void onSaveComplete() {
    wdl.WDL.minecraft.getSaveLoader().flushCache();
    wdl.WDL.saveHandler.flush();
    wdl.WDL.worldClient = null;
    wdl.WDL.worldLoadingDeferred = false;
    if (wdl.WDL.downloading) {
        wdl.WDLMessages.chatMessageTranslated(WDLMessageTypes.INFO, "wdl.messages.generalInfo.saveComplete.startingAgain");
        wdl.WDL.loadWorld();
        return ;
    }
    wdl.WDLMessages.chatMessageTranslated(WDLMessageTypes.INFO, "wdl.messages.generalInfo.saveComplete.done");
}