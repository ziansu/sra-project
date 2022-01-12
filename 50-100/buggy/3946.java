public void turnAllLightsOff() {
    javafx.scene.image.Image image = new javafx.scene.image.Image("com/plp/signalingsystem/pictures/Off.png");
    for (com.plp.signalingsystem.StoplightUIElement e : VALUES_BY_NAME.values()) {
        if ((e.getGridLight()) != null) {
            e.getGridLight().setImage(image);
        }
        if ((e.getRoadLight()) != null) {
            e.getRoadLight().setImage(image);
        }
    }
}