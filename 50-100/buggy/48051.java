@org.junit.Test
public void immediateDeadlineExceeded() {
    io.grpc.ManagedChannel channel = createChannel(new io.grpc.internal.ManagedChannelImplTest.FakeNameResolverFactory(server), io.grpc.internal.ManagedChannelImplTest.NO_INTERCEPTOR);
    io.grpc.ClientCall<java.lang.String, java.lang.Integer> call = channel.newCall(method, CallOptions.DEFAULT.withDeadlineNanoTime(java.lang.System.nanoTime()));
    call.start(mockCallListener, new io.grpc.Metadata());
    org.mockito.Mockito.verify(mockCallListener, org.mockito.Mockito.timeout(1000)).onClose(org.mockito.Matchers.same(Status.DEADLINE_EXCEEDED), org.mockito.Matchers.any(io.grpc.Metadata.class));
}