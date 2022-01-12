private java.lang.Object[] createArrayObject(java.lang.String par) throws com.aliyun.odps.tunnel.TunnelException {
    com.aliyun.odps.tunnel.TableTunnel.UploadSession uploadSession = createUploadSession(par);
    com.aliyun.odps.TableSchema tableSchema = uploadSession.getSchema();
    com.aliyun.odps.tunnel.io.TunnelBufferedWriter tunnelBufferedWriter = createTunnelBufferedWriter(uploadSession);
    return new java.lang.Object[]{ uploadSession , tableSchema , tunnelBufferedWriter , new java.util.concurrent.atomic.AtomicBoolean(true) };
}