private void processMsg(java.lang.String msg) {
    if (chkMsg(msg, com.robic.zoran.arduinoemulator.BlueToothService.MOVE)) {
        android.util.Log.d(com.robic.zoran.arduinoemulator.BlueToothService.TAG, "Process MV message from Client)");
        rdy();
        return ;
    }
    if (chkMsg(msg, com.robic.zoran.arduinoemulator.BlueToothService.ST)) {
        android.util.Log.d(com.robic.zoran.arduinoemulator.BlueToothService.TAG, "Process STATUS message from Client)");
        notRdy();
        return ;
    }
    if (chkMsg(msg, com.robic.zoran.arduinoemulator.BlueToothService.BTRY)) {
        android.util.Log.d(com.robic.zoran.arduinoemulator.BlueToothService.TAG, "Process STATUS message from Client)");
        btryRes();
        return ;
    }
    android.util.Log.d(com.robic.zoran.arduinoemulator.BlueToothService.TAG, "Unknown message received from Arduino");
}