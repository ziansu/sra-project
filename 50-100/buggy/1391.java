public void setVisible(boolean visible) {
    if ((this.visible) == visible)
        return ;
    
    needToRecalcMatrix = true;
    if ((!(this.visible)) && visible) {
        this.visible = true;
        tr.mainRenderer.get().temporarilyMakeImmediatelyRelevant(this);
    }else
        this.visible = visible;
    
    tr.threadManager.submitToGPUMemAccess(new java.util.concurrent.Callable<java.lang.Void>() {
        @java.lang.Override
        public java.lang.Void call() throws java.lang.Exception {
            org.jtrfp.trcl.obj.WorldObject.this.updateStateToGPU();
            return null;
        }
    });
}