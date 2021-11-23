@java.lang.Override
public void paint(java.awt.Graphics2D g, pt.lsts.neptus.renderer2d.StateRenderer2D renderer) {
    synchronized(dataDisplay) {
        if (firstPaint) {
            java.lang.System.out.println("FIRST PAINT");
            int posX = (-((pt.lsts.neptus.hyperspectral.HyperspectralRealTime.MAX_FREQ) / 2)) + ((pt.lsts.neptus.hyperspectral.HyperspectralRealTime.FRAME_HEIGHT) / 2);
            int posY = ((renderer.getHeight()) - (pt.lsts.neptus.hyperspectral.HyperspectralRealTime.FRAME_HEIGHT)) / 2;
            dataDisplay.positionLayer(posX, posY);
            firstPaint = false;
        }else
            dataDisplay.display(g, renderer);
        
    }
}