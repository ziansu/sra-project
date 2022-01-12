public void setModel(org.jtrfp.trcl.gpu.Model m) {
    final org.jtrfp.trcl.core.TRFuture<org.jtrfp.trcl.gpu.Model> thisModelFuture = this.model;
    if (m == null) {
        if (thisModelFuture != null)
            releaseCurrentModel();
        
        return ;
    }
    if (thisModelFuture != null)
        releaseCurrentModel();
    
    try {
        this.model = m.finalizeModel();
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}