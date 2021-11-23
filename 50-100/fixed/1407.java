@org.junit.Test(timeout = 5000)
public void ensureObjectsAreSynchronizedIfOnlyPeerHasObjects() throws java.lang.Exception {
    ch.dissem.bitmessage.networking.NetworkHandlerTest.peerInventory.init("V4Pubkey.payload", "V5Broadcast.payload");
    ch.dissem.bitmessage.networking.NetworkHandlerTest.nodeInventory.init();
    java.lang.Thread t = ch.dissem.bitmessage.networking.NetworkHandlerTest.networkHandler.synchronize(java.net.InetAddress.getLocalHost(), 6001, org.mockito.Mockito.mock(NetworkHandler.MessageListener.class), 10);
    t.join();
    assertInventorySize(2, ch.dissem.bitmessage.networking.NetworkHandlerTest.nodeInventory);
    assertInventorySize(2, ch.dissem.bitmessage.networking.NetworkHandlerTest.peerInventory);
}