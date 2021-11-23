public void act() {
    int i = 0;
    int x = 0;
    band = super.setCom();
    if ((band) == 1) {
        band2 = Ataque();
        super.getTouch();
    }
    if ((band) == 2) {
        Def();
        comando = 0;
    }
    if ((band) == 3) {
        Regreso();
        comando = 0;
    }
}