private void drawSprite(javafx.scene.canvas.GraphicsContext gc, double px, double py) {
    gc.save();
    rotate(gc, rotation, px, py);
    gc.drawImage(sprite, (px - ((sprite.getWidth()) / 2)), (py - ((sprite.getHeight()) / 2)), ((size.width) * (com.jet.framework.entity.Entity.zoom)), ((size.height) * (com.jet.framework.entity.Entity.zoom)));
    gc.restore();
}