public boolean mousedown(haven.Coord c, int button) {
    if ((c.y) < (haven.Window.tdh))
        return false;
    
    parent.setfocus(this);
    raise();
    if (super.mousedown(c, button))
        return true;
    
    if (button == 1) {
        ui.grabmouse(this);
        dm = true;
        doff = c;
    }
    return true;
}