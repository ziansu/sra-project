public static void startPlaying(android.content.Context ctx, java.lang.String url) {
    com.jacobarau.streamplayer.StreamingService.isStreaming = true;
    android.content.Intent intent = new android.content.Intent(ctx, com.jacobarau.streamplayer.StreamingService.class);
    intent.setAction(com.jacobarau.streamplayer.StreamingService.ACTION_START);
    intent.putExtra("url", url);
    ctx.startService(intent);
}