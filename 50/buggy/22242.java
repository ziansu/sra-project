@org.junit.Test
public void testChunkedResponseWithInitialFlush() throws java.io.IOException {
    io.undertow.servlet.test.streams.ServletOutputStreamTestCase.message = io.undertow.servlet.test.streams.ServletOutputStreamTestCase.HELLO_WORLD;
    runTest(io.undertow.servlet.test.streams.ServletOutputStreamTestCase.message, io.undertow.servlet.test.streams.ServletOutputStreamTestCase.BLOCKING_SERVLET, false, true, 1, true);
}