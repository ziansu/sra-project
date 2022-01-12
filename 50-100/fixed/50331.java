public void act() {
    band = super.setCom();
    if ((band) == 1) {
        band2 = Ataque();
        super.getTouch();
    }
    if ((band) == 2) {
        Def();
    }
    if ((band) == 3) {
        Regreso();
    }
}