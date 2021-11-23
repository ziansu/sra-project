@java.lang.Override
public void onClick(android.view.View v) {
    if ((com.example.luc.controlbluetooth.HomePage.btSocket) == null) {
        makeToast("还未连接到蓝牙或者连接蓝牙失败");
    }
    com.example.luc.controlbluetooth.HomePage.ConnectedThread connectedThread = new com.example.luc.controlbluetooth.HomePage.ConnectedThread(com.example.luc.controlbluetooth.HomePage.btSocket);
    connectedThread.start();
}