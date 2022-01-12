@java.lang.Override
public void onTaskSuccess(com.tenkiv.tekdaqc.ATekdaqc tekdaqc) {
    if ((mMessengerList.size()) > 0) {
        com.tenkiv.tekdaqc.android.application.service.Bundle dataBundle = new com.tenkiv.tekdaqc.android.application.service.Bundle();
        dataBundle.putSerializable(TekCast.DATA_MESSSAGE_TEKDAQC, tekdaqc);
        com.tenkiv.tekdaqc.android.application.service.Message dataMessage = com.tenkiv.tekdaqc.android.application.service.Message.obtain();
        dataMessage.what = com.tenkiv.tekdaqc.android.application.util.TekCast.TEKDAQC_TASK_COMPLETE;
        dataMessage.setData(dataBundle);
        sendMessageToRegisteredListeners(dataMessage);
    }
}