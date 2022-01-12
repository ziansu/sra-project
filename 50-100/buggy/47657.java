@java.lang.Override
public void render(double interpolation) {
    if (!(mouseSnap.isFocused()))
        return ;
    
    javagfx.math.Vector pos = player.getPosProgress(((float) (interpolation)));
    canvas.clear();
    canvas.draw(keenIdle, ((int) (pos.getX())), ((int) (pos.getY())));
    canvas.repaint();
}