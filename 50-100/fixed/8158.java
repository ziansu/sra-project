@java.lang.Override
public void onCommandDataMessageReceived(com.tenkiv.tekdaqc.ATekdaqc tekdaqc, com.tenkiv.tekdaqc.communication.message.ABoardMessage message) {
    if ((mMessengerList.size()) > 0) {
        com.tenkiv.tekdaqc.android.application.service.Bundle dataBundle = new com.tenkiv.tekdaqc.android.application.service.Bundle();
        dataBundle.putString(TekCast.DATA_MESSSAGE_TEKDAQC, tekdaqc.getSerialNumber());
        dataBundle.putSerializable(TekCast.DATA_MESSSAGE, message);
        com.tenkiv.tekdaqc.android.application.service.Message dataMessage = com.tenkiv.tekdaqc.android.application.service.Message.obtain();
        dataMessage.what = com.tenkiv.tekdaqc.android.application.util.TekCast.TEKDAQC_COMMAND_MESSAGE;
        dataMessage.setData(dataBundle);
        sendMessageToRegisteredListeners(dataMessage, tekdaqc.getSerialNumber());
    }
}