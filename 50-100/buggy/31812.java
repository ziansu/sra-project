@java.lang.Override
public void shareMessage(java.util.ArrayList<com.google.android.gms.nearby.messages.Message> messages) {
    for (com.google.android.gms.nearby.messages.Message message : messages) {
        if (isConnected) {
            int duration = calculateDuration(message);
            mPubMessages.add(message);
            publish(message, duration);
        }else {
            mPubMessages.add(message);
        }
    }
}