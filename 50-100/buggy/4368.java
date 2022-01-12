@java.lang.Override
public void message(com.pubnub.api.PubNub pubnub, com.pubnub.api.models.consumer.pubsub.PNMessageResult message) {
    if ((message.getChannel()) != null) {
        android.util.Log.i(me.loganfuller.tostr.MainActivity.PN, (("Information from " + (message.getChannel())) + " received."));
        android.util.Log.i(me.loganfuller.tostr.MainActivity.PN, ("Message: " + (message.getMessage())));
        if (message.getMessage().toString().contains("stop")) {
            cancelAlarm();
        }
    }else {
    }
}