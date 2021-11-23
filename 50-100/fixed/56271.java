public int read(byte[] buf) {
    int i;
    int len;
    byte[] rbuf = new byte[64];
    if ((buf.length) > 64) {
        return -1;
    }
    len = mDeviceConnection.bulkTransfer(mFTDIEndpointIN, rbuf, buf.length, 0);
    for (i = 0; i < (len - 2); ++i) {
        buf[i] = rbuf[(i + 2)];
    }
    return len - 2;
}