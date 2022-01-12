public void actionPerformed(java.awt.event.ActionEvent e) {
    kioskNum = java.util.Arrays.asList(floorList).indexOf(FloorCbx.getSelectedItem().toString());
    kiosk = ((MyApp.kiosk.Kiosk) (building.getThread(("k" + (kioskNum)))));
}