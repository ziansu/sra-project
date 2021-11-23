@java.lang.Override
public void run() {
    com.example.georg.radiostreameralt.IcyStreamMeta streamMeta = new com.example.georg.radiostreameralt.IcyStreamMeta();
    try {
        streamMeta.setStreamUrl(new java.net.URL(metadataUrl));
        streamMeta.refreshMeta();
        android.util.Log.w("METADATA", streamMeta.getStreamTitle());
        streamTitle = streamMeta.getStreamTitle();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    android.content.Intent intent = new android.content.Intent();
    intent.setAction("metadataBroadcast");
    intent.putExtra("streamTitle", streamTitle);
    context.sendBroadcast(intent);
}