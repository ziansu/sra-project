@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(com.smigunov.JC600RearViewCamera.JC600RearViewCamera.BROADCAST_ACTION);
    intent.putExtra(JC600RearViewCamera.INTENT_PARAM, JC600RearViewCamera.INTENT_STOP_CAMERA);
    sendBroadcast(intent);
}