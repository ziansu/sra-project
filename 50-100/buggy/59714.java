@org.junit.Test
public void testParseDouble() throws java.lang.Exception {
    net.openhft.chronicle.bytes.Bytes b = net.openhft.chronicle.bytes.Bytes.elasticByteBuffer();
    double expected = 123.1234;
    b.append(expected);
    b.flip();
    org.junit.Assert.assertEquals(expected, net.openhft.chronicle.bytes.BytesUtil.parseDouble(b));
}