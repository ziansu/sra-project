public void zoomIn() {
    if ((zoom) < 3) {
        zoom += 0.3;
        xDif = 0;
        yDif = 0;
    }else {
        xDif = 0;
        yDif = 0;
        if ((selectedStation) > 0) {
            Main.state = Main.State.SPACESTATION;
        }else
            if ((selectedMoon) >= 0) {
                Main.state = Main.State.MOON;
            }else {
                Main.state = Main.State.SURFACE;
            }
        
    }
}