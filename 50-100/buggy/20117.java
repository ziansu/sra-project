public void addTrack(android.media.MediaFormat format, boolean isAudio) {
    if (isAudio) {
        tracks.put(net.ossrs.yasea.SrsMp4Muxer.AUDIO_TRACK, new net.ossrs.yasea.SrsMp4Muxer.Track(tracks.size(), format, true));
    }else {
        tracks.put(net.ossrs.yasea.SrsMp4Muxer.VIDEO_TRACK, new net.ossrs.yasea.SrsMp4Muxer.Track(tracks.size(), format, false));
    }
}