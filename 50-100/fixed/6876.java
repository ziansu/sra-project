@java.lang.Override
public void update(float delta) {
    com.osreboot.ridhvl.painter.HvlCamera.setX(((com.osreboot.ridhvl.painter.HvlCamera.getX()) + (((HvlInputSeriesAction.HORIZONTAL.getCurrentOutput()) * delta) * 256.0F)));
    com.osreboot.ridhvl.painter.HvlCamera.setY(((com.osreboot.ridhvl.painter.HvlCamera.getY()) + (((HvlInputSeriesAction.VERTICAL.getCurrentOutput()) * delta) * 256.0F)));
    if ((tilemaps) != null) {
        tilemaps.update(delta);
        tilemaps.draw(delta);
    }
}