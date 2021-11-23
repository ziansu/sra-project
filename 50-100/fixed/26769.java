public se.skl.tp.vp.vagvalagent.VagvalAgentProcessingLog init(boolean forceReset) {
    se.skl.tp.vp.vagvalagent.VagvalAgentProcessingLog processingLog = new se.skl.tp.vp.vagvalagent.VagvalAgentProcessingLog();
    if (!forceReset) {
        init(processingLog);
    }else {
        boolean isRefreshSuccessful = refresh(false, processingLog);
        processingLog.isRefreshRequested = forceReset;
        processingLog.isRefreshSuccessful = isRefreshSuccessful;
    }
    return processingLog;
}