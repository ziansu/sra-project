protected java.lang.String packetToString(final byte[] data) {
    if (logFullDebug) {
        if (streamHasStrings) {
            return new java.lang.String(data, esa.mo.mal.transport.gen.GENTransport.UTF8_CHARSET);
        }else {
            return esa.mo.mal.transport.gen.util.GENHelper.byteArrayToHexString(data);
        }
    }else {
        return "";
    }
}