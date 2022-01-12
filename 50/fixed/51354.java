public void getSat() throws java.sql.SQLException {
    controller.SatelliteController controller = controller.SatelliteController.getInstance(this);
    this.satellite = controller.getSatellitesList();
}