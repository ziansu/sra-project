private void start() {
    gui.MeasureDialog loading = new gui.MeasureDialog(this, true);
    loading.init(this, com);
    if (!(startVehicleSet()))
        return ;
    
    enableCancelling();
    loading.setVisible(true);
    loading.startMeasurement();
}