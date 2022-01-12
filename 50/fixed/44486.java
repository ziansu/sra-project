private void handleAddClick() {
    javax.swing.JFrame frame = new com.ubcsolar.ui.FakeForecastAddWindow(mySession, listModel, currTime, this);
    frame.setVisible(true);
}