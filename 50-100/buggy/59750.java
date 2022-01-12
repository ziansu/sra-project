public boolean mousedown(haven.Coord c, int button) {
    parent.setfocus(this);
    raise();
    if (super.mousedown(c, button))
        return true;
    
    if ((c.y) < (haven.Window.tdh))
        return false;
    
    if (button == 1) {
        ui.grabmouse(this);
        dm = true;
        doff = c;
    }
    return true;
}