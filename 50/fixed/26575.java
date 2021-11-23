public boolean mmouseup(haven.Coord mc, int button) {
    if ((mgrab) != null) {
        grab.mv = false;
        mgrab.remove();
        mgrab = null;
    }
    return true;
}