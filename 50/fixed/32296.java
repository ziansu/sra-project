private com.aliyun.odps.tunnel.io.TunnelBufferedWriter createTunnelBufferedWriter(com.aliyun.odps.tunnel.TableTunnel.UploadSession uploadSession) throws com.aliyun.odps.tunnel.TunnelException {
    com.aliyun.odps.tunnel.io.TunnelBufferedWriter writer = ((com.aliyun.odps.tunnel.io.TunnelBufferedWriter) (uploadSession.openBufferedWriter()));
    if ((com.dtstack.jlogstash.outputs.OutOdps.bufferSize) > 0) {
        writer.setBufferSize(com.dtstack.jlogstash.outputs.OutOdps.bufferSize);
    }
    return writer;
}