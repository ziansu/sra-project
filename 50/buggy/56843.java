@java.lang.Override
public void onClick(com.smigunov.service.View v) {
    com.smigunov.service.Intent intent = new com.smigunov.service.Intent(com.smigunov.JC600RearViewCamera.JC600RearViewCamera.BROADCAST_ACTION);
    intent.putExtra(JC600RearViewCamera.INTENT_PARAM, JC600RearViewCamera.INTENT_STOP_CAMERA);
    sendBroadcast(intent);
}