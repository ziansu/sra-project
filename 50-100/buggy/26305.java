@org.junit.Test
public void shutdownWithNoTransportsEverCreated() {
    io.grpc.ManagedChannel channel = createChannel(new io.grpc.internal.ManagedChannelImplTest.FakeNameResolverFactory(server), io.grpc.internal.ManagedChannelImplTest.NO_INTERCEPTOR);
    org.mockito.Mockito.verifyNoMoreInteractions(mockTransportFactory);
    channel.shutdown();
    org.junit.Assert.assertTrue(channel.isShutdown());
    org.junit.Assert.assertTrue(channel.isTerminated());
}