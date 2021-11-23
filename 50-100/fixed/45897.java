@org.junit.Test
public void toResponseCode_BaseResponse_Test() {
    final java.lang.String expected = "try (final InputStream inputStream = new ReadableByteChannelInputStream(blockingByteChannel)) {\n" + (("                    final Type result = XmlOutput.fromXml(inputStream, Type.class);\n" + "                    return new TestResponse(result);\n") + "                }\n");
    final com.spectralogic.ds3autogen.java.models.ResponseCode result = toResponseCode(getBaseResponseCode(), "TestResponse", true);
    org.junit.Assert.assertThat(result.getCode(), org.hamcrest.CoreMatchers.is(202));
    org.junit.Assert.assertThat(result.getProcessingCode(), org.hamcrest.CoreMatchers.is(expected));
}