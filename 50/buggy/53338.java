@java.lang.Override
public void run() {
    java.lang.String chandiCode = com.asag.serial.utils.DataUtils.getPreferences("chandi_data", "");
    if (!(android.text.TextUtils.isEmpty(chandiCode))) {
        sendChandiCode(chandiCode);
    }
    sendMessageS(CMDCode.DATA_TRANSFER_FINISH);
}