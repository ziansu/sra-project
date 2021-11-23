@java.lang.Override
public void onClick(android.view.View v) {
    if (isReading) {
        isReading = false;
        btnScan.setText("扫描标签");
        receivingScanBoxScanTagThread.setIsReading(false);
    }else
        if (!(isReading)) {
            isReading = true;
            btnScan.setText("停止扫描");
            receivingScanBoxScanTagThread = new sjtu.rfid.thread.ReceivingScanBoxScanTagThread(mReceivingBoxesItemsList, true, handlerScanTag);
            receivingScanBoxScanTagThread.start();
        }
    
}