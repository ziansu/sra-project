public void close() {
    boolean closeFlag;
    if ((powerONflag) == true) {
        powerCtrl();
        powerONflag = false;
    }
    closeFlag = ComPortClose();
    tx1.setText("");
    tx2.setText("");
    ctrlStatus.setText("");
    tstamp.setText("正常に切断しました");
    if (closeFlag) {
        java.lang.System.out.println("正常に切断しました");
    }
}