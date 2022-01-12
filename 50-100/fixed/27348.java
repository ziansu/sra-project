public void mouseReleased(java.awt.event.MouseEvent event) {
    if (((event.getButton()) == (java.awt.event.MouseEvent.BUTTON3)) || ((wwd.getCurrentPosition()) == null))
        return ;
    
    if (!(dragged)) {
        if ((feature) instanceof gov.nasa.worldwind.ogc.kml.KMLPlacemark)
            controlLayer.addRenderable(createPointPlacemark(wwd.getCurrentPosition(), java.awt.Color.red, 0.2));
        
        wwToKML();
    }
}