@java.lang.Override
public void onDigitalOutputDataReceived(com.tenkiv.tekdaqc.ATekdaqc tekdaqc, boolean[] data) {
    if ((mMessengerList.size()) > 0) {
        com.tenkiv.tekdaqc.android.application.service.Bundle dataBundle = new com.tenkiv.tekdaqc.android.application.service.Bundle();
        dataBundle.putString(TekCast.DATA_MESSSAGE_TEKDAQC, tekdaqc.getSerialNumber());
        dataBundle.putBooleanArray(TekCast.DATA_MESSSAGE, data);
        com.tenkiv.tekdaqc.android.application.service.Message dataMessage = com.tenkiv.tekdaqc.android.application.service.Message.obtain();
        dataMessage.what = com.tenkiv.tekdaqc.android.application.util.TekCast.TEKDAQC_DIGITAL_OUTPUT_MESSAGE;
        dataMessage.setData(dataBundle);
        sendMessageToRegisteredListeners(dataMessage);
    }
}