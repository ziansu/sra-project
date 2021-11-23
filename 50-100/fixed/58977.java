public void actionPerformed(java.awt.event.ActionEvent e) {
    building.getLogger().log(java.util.logging.Level.INFO, ((FloorCbx.getSelectedItem().toString()) + "'s koisk clicked submitFloor."));
    kiosk.readKeypad(Keypadbox.getSelectedItem().toString());
}