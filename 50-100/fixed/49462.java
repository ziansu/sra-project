@java.lang.Override
protected void onRun() {
    for (java.lang.String key : keySet) {
        com.freedomotic.plugins.devices.phwswethv2.Board board = devices.get(key);
        evaluateDiffs(getXMLStatusFile(board), board);
    }
    try {
        java.lang.Thread.sleep(com.freedomotic.plugins.devices.phwswethv2.ProgettiHwSwEthv2.POLLING_TIME);
    } catch (java.lang.InterruptedException ex) {
        java.util.logging.Logger.getLogger(com.freedomotic.plugins.devices.phwswethv2.ProgettiHwSwEthv2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}