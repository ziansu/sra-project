public void actionPerformed(java.awt.event.ActionEvent e) {
    building.getLogger().log(java.util.logging.Level.INFO, (((FloorCbx.getSelectedItem().toString()) + "'s koisk pass RFID id ") + (RFIDCbx.getSelectedItem().toString())));
    kiosk.readRFID(RFIDCbx.getSelectedItem().toString());
}