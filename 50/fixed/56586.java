public void setContainer(java.lang.String container) {
    if (container == null)
        return ;
    
    container = container.toLowerCase();
    this.container = cmanager.Geocache.CONTAINER.getLC(container);
}