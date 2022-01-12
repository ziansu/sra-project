@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (intent.hasExtra("message")) {
        android.os.Bundle bundle = intent.getExtras();
        io.voicelayer.voicelayerSdk.VoiceLayerMessage message = ((io.voicelayer.voicelayerSdk.VoiceLayerMessage) (bundle.get("message")));
        java.lang.String selectedChannelId = _settings.getString(com.givenhansco.keystonenavigation.Activities.PTT.PTTMainActivity.SELECTED_CHANNEL, null);
        if (selectedChannelId != null) {
            if (message.channelId.equals(selectedChannelId)) {
                messagesAdapter.insertItem(message);
            }
        }
        channelAdapter.notifyDataSetChanged();
        messagesAdapter.notifyDataSetChanged();
    }
}