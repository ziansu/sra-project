private boolean sendEnterSendsMessage() {
    if (getTypeOfWork().equalsIgnoreCase(org.lz1aq.lzhfqrp.MainWindow.TYPE_OF_WORK_CQ)) {
        if (jtextfieldCallsign.getText().isEmpty()) {
            pressedF1();
            return false;
        }else {
            pressedF5();
            pressedF2();
            return true;
        }
    }else {
        pressedF4();
        return false;
    }
}