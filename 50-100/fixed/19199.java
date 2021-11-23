protected net.schmizz.concurrent.Promise<net.schmizz.sshj.sftp.Response, net.schmizz.sshj.sftp.SFTPException> asyncWrite(long fileOffset, byte[] data, int off, int len) throws java.io.IOException {
    return requester.request(newRequest(PacketType.WRITE).putUInt64(fileOffset).putUInt32((len - off)).putRawBytes(data, off, len));
}