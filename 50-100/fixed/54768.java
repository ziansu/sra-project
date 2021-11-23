public void initialize() {
    tmpltsModel.loadTemplatesMap("data.properties");
    msgrView.loadTemplatesFromMap(tmpltsModel.getTemplates());
    updateFullVesselLocationView();
    timer = new javax.swing.Timer(5000, this);
    timer.setInitialDelay(0);
    timer.start();
}