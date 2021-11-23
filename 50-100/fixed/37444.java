@java.lang.Override
public void tick(long timestamp) {
    if (running) {
        java.awt.Rectangle screenRectangle = environment.getScreenRect();
        int rightScreenBorder = (screenRectangle.x) + (screenRectangle.width);
        if ((generatedTerrain) <= rightScreenBorder)
            generatedTerrain = spawnStage(rightScreenBorder);
        
    }
}