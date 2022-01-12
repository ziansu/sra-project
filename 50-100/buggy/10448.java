@org.junit.Test(timeout = 10000)
public void ensureObjectsAreSynchronizedIfOnlyNodeHasObjects() throws java.lang.Exception {
    ch.dissem.bitmessage.networking.NetworkHandlerTest.peerInventory.init();
    ch.dissem.bitmessage.networking.NetworkHandlerTest.nodeInventory.init("V1Msg.payload");
    java.lang.Thread t = ch.dissem.bitmessage.networking.NetworkHandlerTest.networkHandler.synchronize(java.net.InetAddress.getLocalHost(), 6001, org.mockito.Mockito.mock(NetworkHandler.MessageListener.class), 10);
    t.join();
    org.junit.Assert.assertEquals(1, ch.dissem.bitmessage.networking.NetworkHandlerTest.nodeInventory.getInventory().size());
    assertInventorySize(1, ch.dissem.bitmessage.networking.NetworkHandlerTest.peerInventory);
}