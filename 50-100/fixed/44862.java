@org.junit.Test
public void testParseFloat() throws java.lang.Exception {
    net.openhft.chronicle.bytes.Bytes b = net.openhft.chronicle.bytes.Bytes.elasticByteBuffer();
    float expected = 123;
    b.append(expected);
    b.flip();
    org.junit.Assert.assertEquals(expected, net.openhft.chronicle.bytes.BytesUtil.parseDouble(b), 0);
}