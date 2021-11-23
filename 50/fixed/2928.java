public void start_voicecall(android.content.Context context, java.lang.Boolean SS) {
    android.content.Intent intent = new android.content.Intent(context, com.rm.flashinglight.Text_to_speech.class);
    if (SS) {
        context.startService(intent);
    }else {
        context.stopService(intent);
    }
}