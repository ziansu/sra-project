@java.lang.Override
public void render(double interpolation) {
    if (!(mouseSnap.isFocused()))
        return ;
    
    canvas.clear();
    javagfx.math.Vector pos = player.getPosProgress(((float) (interpolation)));
    canvas.draw(keenIdle, ((int) (pos.getX())), ((int) (pos.getY())));
    canvas.repaint();
}