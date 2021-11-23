@java.lang.Override
public org.jcodec.common.MuxerTrack addVideoTrack(org.jcodec.common.Codec codec, org.jcodec.common.VideoCodecMeta meta) {
    org.jcodec.containers.mp4.muxer.FramesMP4MuxerTrack track = addTrack(MP4TrackType.VIDEO, codec);
    if (meta != null) {
        if (codec == (org.jcodec.common.Codec.H264)) {
            track.addVideoSampleEntry(meta);
        }else {
            throw new java.lang.RuntimeException("VideoCodecMeta is required upfront for all codecs but H.264");
        }
    }
    return track;
}