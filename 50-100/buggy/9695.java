public void setZoom(double zoom) {
    if ((java.lang.Math.abs(((getMagnification()) - zoom))) <= 0.025) {
        if ((getMagnification()) <= 1.0)
            imp.repaintWindow();
        
        return ;
    }
    if ((getMagnification()) < zoom)
        zoomIn(0, 0);
    else
        zoomOut(0, 0);
    
    setZoom(zoom);
}