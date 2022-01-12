@java.lang.Override
public void handleMessage(android.os.Message message) {
    if ((de.tbjv.rmxmc2.activity.ControllerActivity.currentTrain) == (message.what)) {
        int trainSpeed = de.ccck.rmxmobile.data_management.DataToGuiInterface.getRunningNotch(de.tbjv.rmxmc2.activity.ControllerActivity.currentTrain);
        de.tbjv.rmxmc2.activity.ControllerActivity.fromServer = true;
        de.tbjv.rmxmc2.activity.ControllerActivity.speed.setText(java.lang.String.valueOf(trainSpeed));
        de.tbjv.rmxmc2.activity.ControllerActivity.seekBar1.setProgress(trainSpeed);
    }
}