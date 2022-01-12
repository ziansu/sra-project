private static void parseSendWirePoleCheckRecordByServiceData(java.lang.String response, android.os.Handler handler, java.lang.String SerialNumber) {
    if (response.equals("2")) {
        android.os.Message message = new android.os.Message();
        message.obj = SerialNumber;
        message.what = com.xgf.inspection.network.logic.AppLogic.SEND_RECORD_SUC;
        handler.sendMessage(message);
    }else {
        android.os.Message message = new android.os.Message();
        message.obj = SerialNumber;
        message.what = com.xgf.inspection.network.logic.AppLogic.SEND_RECORD_FAIL;
        handler.sendMessage(message);
    }
}