public void sendCustomBroadcast(boolean phoneRinging, boolean callHooked, boolean missedCall, android.content.Context context) {
    android.content.Intent intent = new android.content.Intent();
    intent.setAction(Constant.BROADCAST_PHONE_STATE_INTENT_ACTION);
    intent.putExtra(Constant.IS_PHONE_RINGING, phoneRinging);
    intent.putExtra(Constant.CALL_HOOKED, callHooked);
    intent.putExtra(Constant.IS_MISSED_CALL, missedCall);
    context.sendBroadcast(intent);
}