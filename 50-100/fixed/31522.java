private void write_h264_ipb_frame(java.util.ArrayList<net.ossrs.yasea.SrsFlvMuxer.SrsFlvFrameBytes> ibps, int frame_type, int dts, int pts) {
    if (!(h264_sps_pps_sent)) {
        return ;
    }
    int avc_packet_type = net.ossrs.yasea.SrsFlvMuxer.SrsCodecVideoAVCType.NALU;
    net.ossrs.yasea.SrsFlvMuxer.SrsFlvFrameBytes flv_tag = avc.mux_avc2flv(ibps, frame_type, avc_packet_type, dts, pts);
    rtmp_write_packet(net.ossrs.yasea.SrsFlvMuxer.SrsCodecFlvTag.Video, dts, frame_type, avc_packet_type, flv_tag);
}