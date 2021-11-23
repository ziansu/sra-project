public void updateViewsInPaths() {
    if ((sourceSinkMgr) == null) {
        nu.NUDisplay.error("sourceSinkManager is not set.", "updateViewsInPaths");
        return ;
    }
    for (soot.jimple.infoflow.nu.FlowPath fp : lst) {
        java.util.List<java.lang.Integer> viewIDs = fp.findViewsInPaths(sourceSinkMgr);
        for (java.lang.Integer id : viewIDs)
            addViewFlowMapping(fp.getId(), id);
        
    }
}