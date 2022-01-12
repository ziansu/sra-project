@java.lang.Override
public void update(java.awt.Graphics g) {
    if (tetrisGrid.checkForLostGame()) {
    }else {
        tetrisGrid.applyForegroundGravity();
        tetrisGrid.updateShadowPosition();
    }
}