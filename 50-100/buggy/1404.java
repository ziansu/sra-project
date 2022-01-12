public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
    java.lang.System.out.println("Refresh rfid database");
    java.util.Arrays.fill(RFIDlist, null);
    RFIDlist = rfid.getAllTheId().parallelStream().toArray(java.lang.String[]::new);
    RFIDCbx.removeAllItems();
    for (java.lang.String rf : RFIDlist)
        RFIDCbx.addItem(rf);
    
}