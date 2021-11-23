public void close() {
    boolean closeFlag;
    closeFlag = ComPortClose();
    tx1.setText("");
    tx2.setText("");
    ctrlStatus.setText("");
    tstamp.setText("正常に切断しました");
    if ((powerONflag) == true) {
        powerCtrl();
        powerONflag = false;
    }
    if (closeFlag) {
        java.lang.System.out.println("正常に切断しました");
    }
}