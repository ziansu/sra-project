@org.junit.BeforeClass
public static void setup() {
    org.semux.core.PendingManagerTest.chain = new org.semux.core.BlockchainImpl(org.semux.db.MemoryDB.FACTORY);
    org.semux.core.PendingManagerTest.pendingMgr = new org.semux.core.PendingManager();
    org.semux.core.PendingManagerTest.channelMgr = new org.semux.net.ChannelManager();
    org.semux.core.PendingManagerTest.pendingMgr.start(org.semux.core.PendingManagerTest.chain, org.semux.core.PendingManagerTest.channelMgr);
}