@java.lang.Override
protected void onEnabled(int track, long positionUs, boolean joining) throws com.google.android.exoplayer.ExoPlaybackException {
    super.onEnabled(track, positionUs, joining);
    parserIndex = getParserIndex(getFormat(track));
    parserThread = new android.os.HandlerThread("textParser");
    parserThread.start();
    parserHelper = new com.google.android.exoplayer.text.SubtitleParserHelper(parserThread.getLooper(), subtitleParsers[parserIndex]);
}