public void set(boolean val) {
    if (val) {
        try {
            cf.flight.set(true);
        } catch (haven.GLSettings e) {
            getparent(haven.GameUI.class).error(e.getMessage());
            return ;
        }
    }else {
        cf.flight.set(false);
    }
    a = val;
    cf.dirty = true;
}