private final void drawIt() {
    if (null == (panel))
        return ;
    
    if (panel.preRenderImage())
        panel.showImage();
    
}