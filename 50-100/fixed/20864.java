static io.datakernel.bytebuf.ByteBuf toGzip(io.datakernel.bytebuf.ByteBuf raw) {
    assert (raw.readRemaining()) > 0;
    try {
        io.datakernel.http.GzipProcessor.ByteBufOutputStream out = new io.datakernel.http.GzipProcessor.ByteBufOutputStream();
        java.util.zip.GZIPOutputStream gzip = new java.util.zip.GZIPOutputStream(out);
        gzip.write(raw.array(), raw.readPosition(), raw.readRemaining());
        gzip.close();
        return out.getBuf();
    } catch (java.io.IOException e) {
        throw new java.lang.AssertionError();
    } finally {
        raw.recycle();
    }
}