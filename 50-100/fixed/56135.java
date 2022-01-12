public java.awt.geom.Point2D.Double getPageOffset() {
    org.apache.poi.xdgf.usermodel.XDGFCell xoffcell = _pageSheet.getCell("XRulerOrigin");
    org.apache.poi.xdgf.usermodel.XDGFCell yoffcell = _pageSheet.getCell("YRulerOrigin");
    double xoffset = 0;
    double yoffset = 0;
    if (xoffcell != null)
        xoffset = java.lang.Double.parseDouble(xoffcell.getValue());
    
    if (yoffcell != null)
        yoffset = java.lang.Double.parseDouble(yoffcell.getValue());
    
    return new java.awt.geom.Point2D.Double(xoffset, yoffset);
}