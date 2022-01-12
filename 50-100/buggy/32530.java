@java.lang.Override
public void render(javafx.scene.canvas.GraphicsContext gc) {
    if (isDead()) {
        return ;
    }
    getBoundingArea().setRotation(this);
    if ((vx) > 0) {
        drawRotatedImage(gc, sprite, getBoundingArea(), false);
    }else
        if ((vx) < 0) {
            drawRotatedImage(gc, sprite, getBoundingArea(), true);
        }else
            if ((vy) > 0) {
            }else {
            }
        
    
}