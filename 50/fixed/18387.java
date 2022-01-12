@java.lang.Override
public void onMessageReceived(com.google.android.gms.wearable.MessageEvent messageEvent) {
    if (messageEvent.getPath().equals("/increase_wear_counter")) {
        tvMessage.setText(java.lang.Integer.toString((++(count))));
    }
}