public void removeCustomGraphicsFactory(org.cytoscape.view.presentation.customgraphics.CyCustomGraphics2Factory<?> factory, java.util.Map<java.lang.Object, java.lang.Object> serviceProps) {
    if (((linearFactory) != null) && (linearFactory.equals(factory))) {
        this.linearFactory = null;
    }else
        if (((radialFactory) != null) && (radialFactory.equals(factory))) {
            this.radialFactory = null;
        }
    
}