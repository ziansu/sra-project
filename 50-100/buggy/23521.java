public void update() {
    if ((fog) != null) {
        fog.update();
    }
    for (core.entities.LightSource l : lights) {
        l.update();
    }
    for (core.entities.Backdrop b : background) {
        b.update();
    }
    for (core.entities.Backdrop b : foreground) {
        b.update();
    }
}