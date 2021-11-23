@java.lang.Override
protected void onHeader(io.datakernel.http.HttpHeader header, final io.datakernel.bytebuf.ByteBuf value) throws io.datakernel.exception.ParseException {
    super.onHeader(header, value);
    if (header == (HttpHeaders.EXPECT)) {
        if (io.datakernel.bytebuf.ByteBufStrings.equalsLowerCaseAscii(io.datakernel.http.HttpServerConnection.EXPECT_100_CONTINUE, value.array(), value.readPosition(), value.readRemaining())) {
            statusExpectContinue = true;
            asyncTcpSocket.write(io.datakernel.bytebuf.ByteBuf.wrapForReading(io.datakernel.http.HttpServerConnection.EXPECT_RESPONSE_CONTINUE));
        }
    }
    request.addHeader(header, value);
}