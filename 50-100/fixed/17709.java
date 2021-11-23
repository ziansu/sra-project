public void updateViewsInPaths() {
    if ((sourceSinkMgr) == null) {
        nu.NUDisplay.error("sourceSinkManager is not set.", "updateViewsInPaths");
        return ;
    }
    for (soot.jimple.infoflow.nu.FlowPath fp : lst) {
        fp.getId();
        java.util.List<java.lang.Integer> viewIDs = fp.findViewsInPaths(sourceSinkMgr);
        if (viewIDs == null)
            continue;
        
        for (java.lang.Integer id : viewIDs) {
            if (id == null)
                continue;
            
            addViewFlowMapping(fp.getId(), id);
        }
    }
}