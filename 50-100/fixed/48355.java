public void setPaletteData(org.eclipse.swt.graphics.PaletteData paletteData) {
    if (paletteData == null)
        return ;
    
    if ((imageServiceBean) == null)
        return ;
    
    imageServiceBean.setPalette(paletteData);
    createScaledImage(org.dawnsci.plotting.draw2d.swtxy.ImageTrace.ImageScaleType.FORCE_REIMAGE, null);
    intensityScale.repaint();
    repaint();
    firePaletteDataListeners(paletteData);
}