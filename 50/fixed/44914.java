@java.lang.Override
public void onAudioEncode(byte[] data, int size, long timeUs) {
    com.wlanjie.streaming.rtmp.Rtmp.muxerAac(data, size, ((int) ((timeUs / 1000) - (mPresentTimeUs))));
}