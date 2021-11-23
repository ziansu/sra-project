public void setSource(@android.support.annotation.NonNull
java.io.InputStream inputStream) {
    if ((is) != null) {
        try {
            is.close();
        } catch (java.io.IOException e) {
        }
    }
    is = inputStream;
    ch.zhaw.bait17.audio_signal_processing_toolbox.player.MP3Decoder.bitstream = new javazoom.jl.decoder.Bitstream(is);
    ch.zhaw.bait17.audio_signal_processing_toolbox.player.MP3Decoder.decoder = new javazoom.jl.decoder.Decoder();
    ch.zhaw.bait17.audio_signal_processing_toolbox.player.MP3Decoder.init();
}