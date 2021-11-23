public void setModel(org.jtrfp.trcl.gpu.Model m) {
    if (m == null)
        throw new java.lang.RuntimeException("Passed model cannot be null.");
    
    final org.jtrfp.trcl.core.TRFuture<org.jtrfp.trcl.gpu.Model> thisModelFuture = this.model;
    if (thisModelFuture != null)
        releaseCurrentModel();
    
    try {
        this.model = m.finalizeModel();
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}