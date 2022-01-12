@java.lang.Override
public void onEvent(org.liquidplayer.service.MicroService service, java.lang.String event, org.json.JSONObject payload) {
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString(com.phonemap.phonemap.constants.API.RETURN, payload.toString());
    messengerSender.setData(bundle).setMessage(com.phonemap.phonemap.constants.Sockets.RETURN_RESULTS).send();
    service.getProcess().exit(0);
    getDataAndCode();
}