public void actionPerformed(java.awt.event.ActionEvent e) {
    if (java.util.Arrays.asList(floorList).contains(Keypadbox.getSelectedItem().toString())) {
        building.getLogger().log(java.util.logging.Level.INFO, ((FloorCbx.getSelectedItem().toString()) + "'s koisk clicked submitFloor."));
        displayText[kioskNum] = kiosk.readKeypad(Keypadbox.getSelectedItem().toString());
    }else {
        displayText[kioskNum] = "Wrong Floor Input, please try again.";
    }
}