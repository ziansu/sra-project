@java.lang.Override
public void draw() {
    p.noCursor();
    p.camera(0, (-(ch.epfl.planair.meta.Constants.EYE_HEIGHT)), (((height) / 2.0F) / (processing.core.PApplet.tan((((processing.core.PConstants.PI) * 30.0F) / 180.0F)))), 0, 0, 0, 0, 1, 0);
    background.draw();
    scoreboard.draw();
    drawMetaPlate(environmentRotation);
}