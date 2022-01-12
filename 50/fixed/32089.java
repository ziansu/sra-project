private static byte[] unchunkAllData(byte[] data, boolean gzipped) throws java.io.IOException {
    byte[] rawdata = com.antest1.kcanotify.KcaUtils.unchunkdata(data);
    if (gzipped)
        rawdata = com.antest1.kcanotify.KcaUtils.gzipdecompress(rawdata);
    
    return rawdata;
}