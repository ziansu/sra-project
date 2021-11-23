@org.junit.Test
public void literalHeaderFieldNeverIndexedNewName() throws java.io.IOException {
    java.util.List<okhttp3.internal.framed.Header> headerBlock = okhttp3.TestUtil.headerEntries("custom-key", "custom-header");
    bytesIn.writeByte(16);
    bytesIn.writeByte(10);
    bytesIn.writeUtf8("custom-key");
    bytesIn.writeByte(13);
    bytesIn.writeUtf8("custom-header");
    hpackReader.readHeaders();
    org.junit.Assert.assertEquals(0, hpackReader.headerCount);
    org.junit.Assert.assertEquals(headerBlock, hpackReader.getAndResetHeaderList());
}