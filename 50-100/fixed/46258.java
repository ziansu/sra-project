public static java.lang.String getCurGroupId(org.agmip.dome.BatchEngine batEngine, boolean isBatchApplied) {
    if (batEngine == null) {
        return "";
    }else {
        if (isBatchApplied) {
            return batEngine.getCurGroupId();
        }else {
            return batEngine.getNextGroupId();
        }
    }
}