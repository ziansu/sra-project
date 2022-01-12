public void write(org.zwen.media.AVStream av, org.zwen.media.AVPacket frame) throws java.io.IOException {
    javax.media.Format vf = frame.getFormat();
    if (Constants.H264.equalsIgnoreCase(vf.getEncoding())) {
        writeH264WithStartCode(frame);
        return ;
    }else
        if (Constants.AAC.equalsIgnoreCase(vf.getEncoding())) {
            writeAAC(frame);
            return ;
        }
    
    org.zwen.media.file.flv.FlvWriter.logger.warn("unsupported format {}", frame.getFormat());
}