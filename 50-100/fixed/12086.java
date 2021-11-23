@java.lang.Override
public void onPointerCancel(playn.core.Pointer.Event event) {
    if (((start) == 0) || (!(untransing)))
        return ;
    
    _udir.update(_cur.screen, _prev.screen, 0);
    _prev.screen.layer.setVisible(false);
    _udir.finish(_cur.screen, _prev.screen);
    clear();
}