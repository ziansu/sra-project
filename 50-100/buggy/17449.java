@java.lang.Override
public android.media.MediaFormat createVideoOutputFormat(android.media.MediaFormat inputFormat) {
    android.media.MediaFormat format = android.media.MediaFormat.createVideoFormat("video/avc", mSize.getWidth(), mSize.getHeight());
    format.setInteger(MediaFormat.KEY_BIT_RATE, mVideoBitrate);
    format.setInteger(MediaFormat.KEY_FRAME_RATE, 30);
    format.setInteger(MediaFormat.KEY_I_FRAME_INTERVAL, 3);
    format.setInteger(MediaFormat.KEY_COLOR_FORMAT, MediaCodecInfo.CodecCapabilities.COLOR_FormatSurface);
    return null;
}