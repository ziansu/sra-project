public void zoomOut() {
    if ((zoom) > 0.4) {
        zoom -= 0.3;
        xDif = 0;
        yDif = 0;
    }else {
        if (isMoon) {
            Main.state = Main.State.PLANETRY;
        }else {
            Main.state = Main.State.SOLAR;
        }
    }
}