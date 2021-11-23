private void runNextBatch(org.apache.pivot.util.concurrent.Task arg0) {
    if (((batEngine) != null) && (batEngine.hasNext())) {
        org.agmip.ui.quadui.QuadCmdLine.LOG.info((("=== Batch " + (batEngine.getNextGroupId())) + " finished ==="));
        startTranslation();
    }else
        if (arg0 != null) {
            arg0.abort();
        }
    
}