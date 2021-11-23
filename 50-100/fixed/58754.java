public void setConnection(nodes.NodeOutputInterface nSource) {
    if ((nSource != null) && (!(this.getType().isAssignableFrom(nSource.getType())))) {
        throw new java.lang.IllegalArgumentException("Type mismatch");
    }
    if ((this.source) != null) {
        this.source.removeConnection(this);
    }
    this.source = nSource;
    if ((this.source) != null)
        nSource.registerConnection(this);
    
}