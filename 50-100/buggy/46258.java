public static java.lang.String getCurBatchInfo(org.agmip.dome.BatchEngine batEngine, boolean isBatchApplied) {
    if (batEngine == null) {
        return "";
    }else {
        if (isBatchApplied) {
            return ("[Batch-" + (batEngine.getCurGroupId())) + "] ";
        }else {
            return ("[Batch-" + (batEngine.getNextGroupId())) + "] ";
        }
    }
}