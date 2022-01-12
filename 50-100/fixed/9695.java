public void setZoom(double zoom) {
    if ((getMagnification()) > zoom) {
        while ((getMagnification()) > zoom)
            zoomOut(0, 0);
        
    }else {
        while ((getMagnification()) < zoom)
            zoomIn(0, 0);
        
    }
    if ((getMagnification()) <= 1.0)
        imp.repaintWindow();
    
}