@java.lang.Override
protected void onNotInUse(io.grpc.internal.InternalSubchannel is) {
    org.junit.Assert.assertSame(internalSubchannel, is);
    callbackInvokes.add("onNotInUse");
}