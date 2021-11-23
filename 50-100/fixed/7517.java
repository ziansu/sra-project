private int getAnimatedAmount() {
    if ((this.tickRemaining) <= (com.mcgame.scdiary.gui.ScreenshotOverlayHandler.ANIMATION_TICK))
        return this.tickRemaining;
    else
        if ((this.tickRemaining) >= ((com.mcgame.scdiary.gui.ScreenshotOverlayHandler.OPEN_DURATION) - (com.mcgame.scdiary.gui.ScreenshotOverlayHandler.ANIMATION_TICK)))
            return (com.mcgame.scdiary.gui.ScreenshotOverlayHandler.OPEN_DURATION) - (this.tickRemaining);
        else
            return com.mcgame.scdiary.gui.ScreenshotOverlayHandler.ANIMATION_TICK;
        
    
}