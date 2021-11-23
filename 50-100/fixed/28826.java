@org.junit.Test
public void payloadSmallerThanWindowShouldBeWrittenImmediately() throws io.netty.handler.codec.http2.Http2Exception {
    io.netty.handler.codec.http2.DefaultHttp2RemoteFlowControllerTest.FakeFlowControlled data = new io.netty.handler.codec.http2.DefaultHttp2RemoteFlowControllerTest.FakeFlowControlled(5);
    sendData(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowControllerTest.STREAM_A, data);
    data.assertNotWritten();
    org.mockito.Mockito.verifyZeroInteractions(listener);
    controller.writePendingBytes();
    data.assertFullyWritten();
    org.mockito.Mockito.verifyZeroInteractions(listener);
}